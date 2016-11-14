package com.udacity.ucar;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

/**
 * Created by ik on 09-11-2016.
 */

public class Helper {

    public static void setImage(Context context, ImageView iv, int position, boolean isSelectedImg){
        if(isSelectedImg){
            if(position ==0){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.u_wordmark_slate));
            }else if(position ==1){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.functions_icon_selected));
            }else if(position == 2){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.locks_icon_selected));
            }else if(position == 3){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.statistical_icon_selected));
            }else if(position == 4){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.route_icon_selected));
            }else if(position == 5){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.adjustment_icon_selected));
            }else if(position == 6){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.music_icon_selected));
            }else if(position == 7){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.luxury_icon_selected));
            }
        }else{
            if(position ==0){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.u_wordmark_slate));
            }else if(position ==1){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.functions_icon));
            }else if(position == 2){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.locks_icon));
            }else if(position == 3){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.statistical_icon));
            }else if(position == 4){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.route_icon));
            }else if(position == 5){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.adjustment_icon));
            }else if(position == 6){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.music_icon));
            }else if(position == 7){
                iv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.luxury_icon));
            }
        }
    }

}
