package com.example.horton.news_panzhi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.horton.news_panzhi.Menu.BasePage;
import com.example.horton.news_panzhi.Menu.CustomViewPager;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public  class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }



    /** PlaceholderAdapter */
    class PlaceholderAdapter extends PagerAdapter{
        private Context mContext;
        private ArrayList<BasePage> pages;

        public PlaceholderAdapter(Context ct, ArrayList<BasePage> pages){
            this.mContext = ct;
            this.pages = pages;
        }
        @Override
        public int getCount() {
            return pages.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((CustomViewPager)container).removeView(pages.get(position).getContentView());
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ((CustomViewPager)container).addView(pages.get(position).getContentView(), 0);
            return pages.get(position).getContentView();
        }
    }
}
