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
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
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
public class LoadingDialog {
	private View view;
	private TextView loadingDialogTextView;
	private ImageView loadingDialogImageView;
	private Dialog loadDialog;
	Animation loadingAnimation;
	public LoadingDialog(Context context) {
		
		view = LayoutInflater.from(context).inflate(
				R.layout.library_loadingdialog_layout, null);
		loadingDialogTextView = (TextView) view
				.findViewById(R.id.library_loadingdialog_title);
		loadingDialogImageView = (ImageView) view
				.findViewById(R.id.library_loadingdialog_image);
		loadingAnimation = AnimationUtils.loadAnimation(context,
				R.anim.library_loading_progressbar);
		loadingDialogImageView.startAnimation(loadingAnimation);
		loadDialog = new Dialog(context, R.style.loading_dialog);
		loadDialog.setCancelable(false);// 不可以用“返回键”取消
		loadDialog.setContentView(view);
		
	}


	public void toggleDialog() {
		if (loadDialog.isShowing()) {
			loadDialog.dismiss();
		} else {
			loadDialog.show();
		}
	}

	

	

}
