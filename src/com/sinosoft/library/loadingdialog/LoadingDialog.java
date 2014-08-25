/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  LoaDingDialog.java   
 * @Package com.sinosoft.library.loadingdialog   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-7-15 上午10:37:44   
 * @version V1.0     
 */
package com.sinosoft.library.loadingdialog;

import android.R.layout;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ActionBar.LayoutParams;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView.FindListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sinosoft.loadingdialoglibrary.R;

/**
 * @ClassName: LoaDingDialog
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: gjy
 * @date: 2014-7-15 上午10:37:44
 * 
 */

@SuppressLint("NewApi")
public class LoadingDialog extends Dialog {
	Animation loadingAnimation;
	ImageView loadingDialogImageView;
	static TextView textView;
	private Context context;

	public LoadingDialog(Context context) {
		super(context, R.style.loading_dialog);
		this.context = context;
		this.setContentView(R.layout.library_loadingdialog_layout);
		this.getWindow().setBackgroundDrawable(new ColorDrawable(0));
		loadingDialogImageView = (ImageView) findViewById(R.id.library_loadingdialog_image);
		loadingAnimation = AnimationUtils.loadAnimation(context,
				R.anim.library_loading_progressbar);
		loadingDialogImageView.startAnimation(loadingAnimation);
		textView = (TextView) findViewById(R.id.library_loadingdialog_title);
		this.setCanceledOnTouchOutside(false);
	}

	public void setText(String str){
		textView.setText(str);
	}
}
