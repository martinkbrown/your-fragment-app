package your.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class YourListFragment extends ListFragment {

	String[] headlines = new String[]{"Google merges with Apple!",
										"The BlackBerry is Back!", 
										"Hungry? Why Wait",
										"Get Started on HW3 Today!",
										"Intern with the Mobile Lab",
										"Let's Play Volleyball",
										"Question: Answered",
										"Office Hours Location Changed"};
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
		// we can call getListView() here because this class extends ListFragment
		// if we didn't extend ListFragment, we would have to add our own ListView
		// some other way. Maybe via XML or programmatically
		ListView lv = getListView();
		
		// you may need to call this in order for the listview to show up
		setListShown(true);
		
		// you've seen this before
		lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, headlines));
	}
	
}
