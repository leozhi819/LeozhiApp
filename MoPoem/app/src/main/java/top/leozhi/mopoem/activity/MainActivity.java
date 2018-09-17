package top.leozhi.mopoem.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import top.leozhi.mopoem.R;

public class MainActivity extends AppCompatActivity  
{
	private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_main);
		setSupportActionBar(toolbar);

		drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
			this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		drawer.setDrawerListener(toggle);
		toggle.syncState();

		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
				@Override
				public boolean onNavigationItemSelected(MenuItem item){

					int id = item.getItemId ();
					if (id == R.id.home) {

					}else if(id == R.id.memoirs){

					}else if(id == R.id.contacts){

					}
					drawer.closeDrawers();
					return true;
				}
			});
    }
}
