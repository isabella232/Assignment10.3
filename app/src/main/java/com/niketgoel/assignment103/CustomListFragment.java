package com.niketgoel.assignment103;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by niketgoel on 25/11/17.
 */

public class CustomListFragment extends ListFragment {
    private ListView listView;
    //creating the interface to communicate with other fragments and main activity
    public interface  OnMasterSelectedListener {
        public void onItemSelected(String layoutNumber);
    }

    //setting the interface callback listener
    private  OnMasterSelectedListener
            mOnMasterSelectedListener =null;
    public void setmOnMasterSelectedListener(OnMasterSelectedListener listener){
        mOnMasterSelectedListener = listener;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.custom_list, container, false);

        return rootView;

    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);

        CustomList health_data[] = new CustomList[]
                {
                        new CustomList(R.drawable.donut, "Donut ","Description"),
                        new CustomList(R.drawable.eclair, "Eclair","Description"),
                        new CustomList(R.drawable.froyo, "Froyo","Description"),
                        new CustomList(R.drawable.gingerbread, "Gingerbread","Description"),
                        new CustomList(R.drawable.honeycomb, "Honeycomb","Description")
                };

        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(),
                R.layout.list_item, health_data);

        /** Setting the array adapter to the list view */
        setListAdapter(adapter);



    }

}
