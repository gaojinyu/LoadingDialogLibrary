/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  LoadingProgressBar.java   
 * @Package com.sinosoft.library.progressbar   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: gjy     
 * @date:   2014-7-15 下午12:53:52   
 * @version V1.0     
 */  
package com.sinosoft.library.progressbar;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.sinosoft.loadingdialoglibrary.R;

/**   
 * @ClassName:  LoadingProgressBar   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: gjy  
 * @date:   2014-7-15 下午12:53:52   
 *      
 */

public class LoadingProgressBar extends LinearLayout{

	private ImageView progressbarImage;
	/**   
	 * @Title:  LoadingProgressBar   
	 * @Description:    TODO(这里用一句话描述这个方法的作用)   
	 * @param:  @param context
	 * @param:  @param attrs  
	 * @throws   
	 */  
	public LoadingProgressBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.library_progressbar_layout, this);
		progressbarImage=(ImageView)findViewById(R.id.library_progressbar_img);
		progressbarImage.startAnimation(new AnimationUtils().loadAnimation(context, R.anim.library_loading_progressbar));
		
	}

}
