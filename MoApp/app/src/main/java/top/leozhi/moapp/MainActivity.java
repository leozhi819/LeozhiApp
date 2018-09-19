package top.leozhi.moapp;

import android.os.Bundle;
import top.leozhi.moapp.activity.BaseActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import top.leozhi.moapp.utils.StatusBarUtil;


public class MainActivity extends BaseActivity 
{
	private DrawerLayout mDrawerLayout;
	private Toolbar mToolbar;
	
	private int mStatusBarColor;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mToolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(mToolbar);
		
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open,
																 R.string.navigation_drawer_close);
		toggle.syncState();
	}
	
	@Override
    protected void setStatusBar() {
        mStatusBarColor = getResources().getColor(R.color.colorPrimary);
        StatusBarUtil.setColorForDrawerLayout(this, (DrawerLayout) findViewById(R.id.drawer_layout), mStatusBarColor, 0);
	}
}
