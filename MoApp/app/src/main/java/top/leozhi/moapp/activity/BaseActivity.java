package top.leozhi.moapp.activity;

import android.support.v7.app.AppCompatActivity;
import top.leozhi.moapp.utils.StatusBarUtil;
import top.leozhi.moapp.R;
import android.view.MenuItem;

public class BaseActivity extends AppCompatActivity
{

	@Override
	public void setContentView(int layoutResID)
	{
		super.setContentView(layoutResID);
		setStatusBar();
	}

	protected void setStatusBar(){
		StatusBarUtil.setColor(this, getResources().getColor(R.color.colorPrimary));
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		
		return super.onOptionsItemSelected(item);
	}
}
