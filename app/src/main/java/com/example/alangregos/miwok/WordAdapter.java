package com.example.alangregos.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.miwok.R;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<ListEntry> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mbackroundColor;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context   The current context. Used to inflate the layout file.
     * @param listEntry A List of AndroidFlavor objects to display in a list
     */

    public WordAdapter(Activity context, ArrayList<ListEntry> listEntry, int backroundColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, listEntry);
        mbackroundColor = backroundColor;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        ListEntry currentListEntry = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentListEntry.getmMiwokWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultLanguageTextView = (TextView) listItemView.findViewById(R.id.default_language_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultLanguageTextView.setText(currentListEntry.getmDefaultWord());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.word_image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView

        //set the backround color of all the text views in the list
        View container = (View) listItemView.findViewById(R.id.text_view_container);
        View playIcon = (View) listItemView.findViewById(R.id.play_button);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mbackroundColor);
        container.setBackgroundColor(color);
        playIcon.setBackgroundColor(color);

        //decide if the image view will be rendered removed from the layout
        if (currentListEntry.hasImage()) {
            iconView.setImageResource(currentListEntry.getImage());
            iconView.setVisibility(View.VISIBLE);

        } else iconView.setVisibility(View.GONE);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}
