package top.leozhi.moapp;

import android.os.Bundle;
import top.leozhi.moapp.activity.BaseActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import top.leozhi.moapp.utils.StatusBarUtil;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.widget.SearchView.*;
import android.view.View;
import android.view.MenuItem;
import java.util.List;
import java.util.ArrayList;


public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener
{
	private DrawerLayout mDrawerLayout;
	private Toolbar mToolbar;
	private FloatingActionButton fab;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
	private NavigationView mNavigationView;
	
	private int mStatusBarColor;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		initView();
		initViewPager();
	}
	
	@Override
    protected void setStatusBar() {
        mStatusBarColor = getResources().getColor(R.color.colorPrimary);
        StatusBarUtil.setColorForDrawerLayout(this, (DrawerLayout) findViewById(R.id.drawer_layout), mStatusBarColor, 0);
	}
	
	public void initView(){
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mToolbar = (Toolbar) findViewById(R.id.toolbar);
		mNavigationView = (NavigationView) findViewById(R.id.navigation);
		fab = (FloatingActionButton) findViewById(R.id.fab_main);
		setSupportActionBar(mToolbar);

		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open,
																 R.string.navigation_drawer_close);
		toggle.syncState();
		
		mNavigationView.setNavigationItemSelectedListener(this);
        mNavigationView.setItemIconTintList(null);
	}
	
	public void initViewPager(){
		mTabLayout = (TabLayout) findViewById(R.id.tab_layout_main);
        mViewPager = (ViewPager) findViewById(R.id.view_pager_main);
		List<String> titles = new ArrayList<>();
        titles.add(getString(R.string.tab_title_main_1));
        titles.add(getString(R.string.tab_title_main_2));
        titles.add(getString(R.string.tab_title_main_3));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(2)));
		
	}
	
	@Override
	public boolean onNavigationItemSelected(MenuItem menu)
	{
		
		return false;
	}
	
	@Override
	public void onClick(View v)
	{
	
	}
}
