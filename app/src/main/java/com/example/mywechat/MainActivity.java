package com.example.mywechat;



import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;


import androidx.fragment.app.Fragment;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment mTab01 = new weixinFragment();
    private Fragment mTab02 = new frdFragment();
    private Fragment mTab03 = new contactFragment();
    private Fragment mTab04 = new settingFragment();

    private LinearLayout mTabWeiXin;
    private LinearLayout mTabFrd;
    private LinearLayout mTabContact;
    private LinearLayout mTabSetting;

    private ImageButton mImgWeixin;
    private ImageButton mImgFrd;
    private ImageButton mImgContact;
    private ImageButton mImgSetting;

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        initView();
        initFragment();
        selectfragment(0);
        initEvent();
    }

    //把界面压入fragmentlayout中
    public void initFragment(){
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.id_content,mTab01);
        transaction.add(R.id.id_content,mTab02);
        transaction.add(R.id.id_content,mTab03);
        transaction.add(R.id.id_content,mTab04);
        transaction.commit();
    }

    //响应区域设置
    public void initView(){
        mTabWeiXin = (LinearLayout) findViewById(R.id.id_tab_weixin);
        mTabFrd = (LinearLayout) findViewById(R.id.id_tab_frd);
        mTabContact = (LinearLayout) findViewById(R.id.id_tab_contact);
        mTabSetting =(LinearLayout) findViewById(R.id.id_tab_setting);

        mImgWeixin = (ImageButton) findViewById(R.id.id_tab_weixin_img);
        mImgFrd = (ImageButton) findViewById(R.id.id_tab_frd_img);
        mImgContact = (ImageButton) findViewById(R.id.id_tab_contact_img);
        mImgSetting = (ImageButton) findViewById(R.id.id_tab_setting_img);

    }

    //界面显示
    public void selectfragment(int i ){
        FragmentTransaction transaction = manager.beginTransaction();
        hideFragment(transaction);
        //把图片设置为亮的
        //设置内容区域
        switch (i){
            case 0:
                transaction.show(mTab01);
                mImgWeixin.setImageResource(R.drawable.tab_weixin_pressed);
                break;
            case 1:
                transaction.show(mTab02);
                mImgFrd.setImageResource(R.drawable.tab_find_frd_pressed);
                break;
            case 2:
                transaction.show(mTab03);
                mImgContact.setImageResource(R.drawable.tab_address_pressed);
                break;
            case 3:
                transaction.show(mTab04);
                mImgSetting.setImageResource(R.drawable.tab_settings_pressed);
                break;
            default:
                break;
        }
        transaction.commit();
    }

    //隐藏fragment
    public void hideFragment(FragmentTransaction transaction){
        transaction.hide(mTab01);
        transaction.hide(mTab02);
        transaction.hide(mTab03);
        transaction.hide(mTab04);
    }

    @Override
    public void onClick(View v) {
        resetImags();
        switch (v.getId()){
            case R.id.id_tab_weixin:
                selectfragment(0);
                break;
            case R.id.id_tab_weixin_img:
                selectfragment(0);
                break;
            case R.id.id_tab_frd:
                selectfragment(1);
                break;
            case R.id.id_tab_frd_img:
                selectfragment(1);
                break;
            case R.id.id_tab_contact:
                selectfragment(2);
                break;
            case R.id.id_tab_contact_img:
                selectfragment(2);
                break;
            case  R.id.id_tab_setting:
                selectfragment(3);
                break;
            case  R.id.id_tab_setting_img:
                selectfragment(3);
                break;
            default:
                break;
        }

    }

    //切换图片至灰色
    public  void resetImags(){
        mImgWeixin.setImageResource(R.drawable.tab_weixin_normal);
        mImgFrd.setImageResource(R.drawable.tab_find_frd_normal);
        mImgContact.setImageResource(R.drawable.tab_address_normal);
        mImgSetting.setImageResource(R.drawable.tab_settings_normal);

    }

    //设置监听过程
    public void initEvent(){
        mTabWeiXin.setOnClickListener(this);  //只有text区域有效
        mImgWeixin.setOnClickListener(this);

        mTabFrd.setOnClickListener(this);
        mImgFrd.setOnClickListener(this);

        mTabContact.setOnClickListener(this);
        mImgContact.setOnClickListener(this);

        mTabSetting.setOnClickListener(this);
        mImgSetting.setOnClickListener(this);
    }

}
