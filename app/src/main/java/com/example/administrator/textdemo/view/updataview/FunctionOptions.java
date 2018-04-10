package com.example.administrator.textdemo.view.updataview;

import android.graphics.Color;

import com.example.administrator.textdemo.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * author：luck
 * project：PictureSelector
 * package：com.luck.picture.lib.model
 * email：893855882@qq.com
 * data：2017/4/24
 */

public class FunctionOptions implements Serializable {

    private int type; // 图片 or 视频
    private int maxSelectNum; // 多选最大可选数量
    private int minSelectNum; // 多选最低可选数量
    private int selectMode; // 单选 or 多选
    private boolean isShowCamera = true; // 是否显示相机
    private boolean enablePreview = true; // 是否预览图片
    private boolean isPreviewVideo; // 是否可预览视频(播放)
    private int imageSpanCount = 4; // 列表每行显示个数
    private int themeStyle; // 标题栏背景色;
    private int leftBackDrawable;// 返回箭头
    private int checkedBoxDrawable;// 图片选择默认样式
    private int recordVideoSecond;// 录视频秒数
    private int recordVideoDefinition;// 视频清晰度
    private boolean isCompress = false;// 是否压缩图片，默认不压缩
    private boolean isCheckNumMode;// 是否显示QQ风格选择图片
    private int previewColor; // 底部预览字体颜色
    private int completeColor; // 底部完成字体颜色
    private int bottomBgColor; // 底部背景色
    private int previewBottomBgColor; // 预览底部背景色
    private int previewTopBgColor; // 预览标题背景色
    private int compressQuality;// 图片裁剪质量,默认无损
    private List<LocalMedia> selectMedia = new ArrayList<>();// 已选择的图片
    private int compressFlag; // 1 系统自带压缩 2 luban压缩
    private int compressW; // 压缩宽
    private int compressH; // 压缩高
    private int grade;// 压缩档次
    private int maxB;// 压缩多少kb以内
    private boolean isGif;// 是否显示gif
    private int qq_theme;// QQ数字风格
    private long videoS = 0;
    private int picture_title_color;
    private int picture_right_color;
    private int statusBar;
    private boolean isImmersive;
    private boolean isNumComplete;
    private boolean isClickVideo;
    /**
     * 是否启用像素压缩
     */
    private boolean isEnablePixelCompress = true;
    /**
     * 是否启用质量压缩
     */
    private boolean isEnableQualityCompress = true;

    public FunctionOptions() {
        super();

    }

    public boolean isClickVideo() {
        return isClickVideo;
    }

    public void setClickVideo(boolean clickVideo) {
        isClickVideo = clickVideo;
    }

    public boolean isImmersive() {
        return isImmersive;
    }

    public void setImmersive(boolean immersive) {
        isImmersive = immersive;
    }

    public int getStatusBar() {
        if (statusBar == 0) {
            statusBar = themeStyle;
        }
        return statusBar;
    }

    public void setStatusBar(int statusBar) {
        this.statusBar = statusBar;
    }

    public boolean isNumComplete() {
        return isNumComplete;
    }

    public void setNumComplete(boolean numComplete) {
        isNumComplete = numComplete;
    }

    public int getPicture_title_color() {
        if (picture_title_color == 0) {
            picture_title_color = Color.parseColor("#FFFFFF");
        }
        return picture_title_color;
    }

    public void setPicture_title_color(int picture_title_color) {
        this.picture_title_color = picture_title_color;
    }

    public int getPicture_right_color() {
        if (picture_right_color == 0) {
            picture_right_color = Color.parseColor("#FFFFFF");
        }
        return picture_right_color;
    }

    public void setPicture_right_color(int picture_right_color) {
        this.picture_right_color = picture_right_color;
    }

    public int getLeftBackDrawable() {
        if (leftBackDrawable == 0) {
            leftBackDrawable = R.drawable.picture_back;
        }
        return leftBackDrawable;
    }

    public void setLeftBackDrawable(int leftBackDrawable) {
        this.leftBackDrawable = leftBackDrawable;
    }

    public int getType() {
        if (type == 0) {
            // 默认图片选择
            type = FunctionConfig.TYPE_IMAGE;
        }
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public int getMaxSelectNum() {
        if (maxSelectNum == 0) {
            maxSelectNum = FunctionConfig.SELECT_MAX_NUM;
        }
        return maxSelectNum;
    }

    public void setMaxSelectNum(int maxSelectNum) {
        this.maxSelectNum = maxSelectNum;
    }

    public int getMinSelectNum() {
        return minSelectNum;
    }

    public void setMinSelectNum(int minSelectNum) {
        this.minSelectNum = minSelectNum;
    }

    public int getSelectMode() {
        if (selectMode == 0) {
            selectMode = FunctionConfig.MODE_MULTIPLE;
        }
        return selectMode;
    }

    public long getVideoS() {
        return videoS * 1000;
    }

    public void setVideoS(long videoS) {
        this.videoS = videoS;
    }


    public void setSelectMode(int selectMode) {
        this.selectMode = selectMode;
    }

    public boolean isShowCamera() {
        return isShowCamera;
    }

    public void setShowCamera(boolean showCamera) {
        isShowCamera = showCamera;
    }

    public boolean isGif() {
        return isGif;
    }

    public void setGif(boolean gif) {
        isGif = gif;
    }


    public boolean isEnablePreview() {
        return enablePreview;
    }

    public void setEnablePreview(boolean enablePreview) {
        this.enablePreview = enablePreview;
    }


    public boolean isPreviewVideo() {
        return isPreviewVideo;
    }

    public void setPreviewVideo(boolean previewVideo) {
        isPreviewVideo = previewVideo;
    }

    public int getImageSpanCount() {
        return imageSpanCount;
    }

    public void setImageSpanCount(int imageSpanCount) {
        this.imageSpanCount = imageSpanCount;
    }

    public int getThemeStyle() {
        if (themeStyle == 0) {
            themeStyle = Color.parseColor("#c00c0d");
        }
        return themeStyle;
    }

    public void setThemeStyle(int themeStyle) {
        this.themeStyle = themeStyle;
    }

    public int getCheckedBoxDrawable() {
        // 如果是QQ选择风格
        if (isCheckNumMode) {
            // 如果没有自定义QQ数字风格，则使用默认
            if (qq_theme == 0) {
                checkedBoxDrawable = R.drawable.checkbox_num_selector;
            } else {
                checkedBoxDrawable = qq_theme;
            }
        }
        if (checkedBoxDrawable == 0) {
            checkedBoxDrawable = R.drawable.checkbox_selector;
        }
        return checkedBoxDrawable;
    }

    public void setCheckedBoxDrawable(int checkedBoxDrawable) {
        this.checkedBoxDrawable = checkedBoxDrawable;
    }

    public int getCustomQQ_theme() {
        return qq_theme;
    }

    public void setCustomQQ_theme(int qq_theme) {
        this.qq_theme = qq_theme;
    }


    public int getRecordVideoSecond() {
        return recordVideoSecond;
    }

    public void setRecordVideoSecond(int recordVideoSecond) {
        this.recordVideoSecond = recordVideoSecond;
    }

    public int getRecordVideoDefinition() {
        return recordVideoDefinition;
    }

    public void setRecordVideoDefinition(int recordVideoDefinition) {
        this.recordVideoDefinition = recordVideoDefinition;
    }

    public boolean isCompress() {
        return isCompress;
    }

    public void setCompress(boolean compress) {
        isCompress = compress;
    }

    public boolean isCheckNumMode() {
        if (isCheckNumMode) {

        }
        return isCheckNumMode;
    }

    public void setCheckNumMode(boolean checkNumMode) {
        isCheckNumMode = checkNumMode;
    }

    public int getPreviewColor() {
        if (previewColor == 0) {
            previewColor = Color.parseColor("#FA632D");
        }
        return previewColor;
    }

    public void setPreviewColor(int previewColor) {
        this.previewColor = previewColor;
    }

    public int getCompleteColor() {
        if (completeColor == 0) {
            completeColor = Color.parseColor("#FA632D");
        }
        return completeColor;
    }

    public void setCompleteColor(int completeColor) {
        this.completeColor = completeColor;
    }

    public int getBottomBgColor() {
        if (bottomBgColor == 0) {
            bottomBgColor = Color.parseColor("#f3f3f3");
        }
        return bottomBgColor;
    }

    public void setBottomBgColor(int bottomBgColor) {
        this.bottomBgColor = bottomBgColor;
    }

    public int getPreviewBottomBgColor() {
        if (previewBottomBgColor == 0) {
            previewBottomBgColor = Color.parseColor("#dd393a3e");
        }
        return previewBottomBgColor;
    }

    public void setPreviewBottomBgColor(int previewBottomBgColor) {
        this.previewBottomBgColor = previewBottomBgColor;
    }

    public int getPreviewTopBgColor() {
        if (previewTopBgColor == 0) {
            previewTopBgColor = Color.parseColor("#393a3e");
        }
        return previewTopBgColor;
    }

    public void setPreviewTopBgColor(int previewTopBgColor) {
        this.previewTopBgColor = previewTopBgColor;
    }

    public int getCompressQuality() {
        if (compressQuality == 0) {
            compressQuality = 100;
        }
        return compressQuality;
    }

    public void setCompressQuality(int compressQuality) {
        this.compressQuality = compressQuality;
    }

    public List<LocalMedia> getSelectMedia() {
        if (selectMedia == null){
            selectMedia = new ArrayList<>();
        }
        return selectMedia;
    }

    public void setSelectMedia(List<LocalMedia> selectMedia) {
        this.selectMedia = selectMedia;
    }

    public int getCompressFlag() {
        if (compressFlag == 0) {
            compressFlag = 1;
        }
        return compressFlag;
    }

    public void setCompressFlag(int compressFlag) {
        this.compressFlag = compressFlag;
    }

    public int getCompressW() {
        return compressW;
    }

    public void setCompressW(int compressW) {
        this.compressW = compressW;
    }

    public int getCompressH() {
        return compressH;
    }

    public void setCompressH(int compressH) {
        this.compressH = compressH;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getMaxB() {
        if (maxB == 0) {
            maxB = FunctionConfig.MAX_COMPRESS_SIZE;
        }
        return maxB;
    }

    public void setMaxB(int maxB) {
        this.maxB = maxB;
    }

    public boolean isEnablePixelCompress() {
        return isEnablePixelCompress;
    }

    public void setEnablePixelCompress(boolean enablePixelCompress) {
        isEnablePixelCompress = enablePixelCompress;
    }

    public void setEnableQualityCompress(boolean enableQualityCompress) {
        isEnableQualityCompress = enableQualityCompress;
    }

    public boolean isEnableQualityCompress() {
        return isEnableQualityCompress;
    }


    public static class Builder {
        private FunctionOptions options;

        public Builder() {
            options = new FunctionOptions();
        }

        public Builder setType(int type) {
            options.setType(type);
            return this;
        }


        public Builder setMaxSelectNum(int maxSize) {
            options.setMaxSelectNum(maxSize);
            return this;
        }

        public Builder setMinSelectNum(int minSize) {
            options.setMinSelectNum(minSize);
            return this;
        }

        public Builder setSelectMode(int selectMode) {
            options.setSelectMode(selectMode);
            return this;
        }

        public Builder setShowCamera(boolean showCamera) {
            options.setShowCamera(showCamera);
            return this;
        }

        public Builder setEnablePreview(boolean isEnablePreview) {
            options.setEnablePreview(isEnablePreview);
            return this;
        }


        public Builder setPreviewVideo(boolean isPreviewVideo) {
            options.setPreviewVideo(isPreviewVideo);
            return this;
        }

        public Builder setImageSpanCount(int spanCount) {
            options.setImageSpanCount(spanCount);
            return this;
        }

        public Builder setThemeStyle(int themeStyle) {
            options.setThemeStyle(themeStyle);
            return this;
        }

        public Builder setCheckedBoxDrawable(int checkedBoxDrawable) {
            options.setCheckedBoxDrawable(checkedBoxDrawable);
            return this;
        }

        public Builder setVideoS(long videoS) {
            options.setVideoS(videoS);
            return this;
        }

        public Builder setGif(boolean isGif) {
            options.setGif(isGif);
            return this;
        }


        public Builder setRecordVideoSecond(int recordVideoSecond) {
            options.setRecordVideoSecond(recordVideoSecond);
            return this;
        }

        public Builder setRecordVideoDefinition(int recordVideoDefinition) {
            options.setRecordVideoDefinition(recordVideoDefinition);
            return this;
        }

        public Builder setCompress(boolean isCompress) {
            options.setCompress(isCompress);
            return this;
        }

        public Builder setCheckNumMode(boolean checkNumMode) {
            options.setCheckNumMode(checkNumMode);
            return this;
        }

        public Builder setPreviewColor(int previewColor) {
            options.setPreviewColor(previewColor);
            return this;
        }

        public Builder setCompleteColor(int completeColor) {
            options.setCompleteColor(completeColor);
            return this;
        }

        public Builder setBottomBgColor(int bottomBgColor) {
            options.setBottomBgColor(bottomBgColor);
            return this;
        }

        public Builder setPreviewTopBgColor(int topBgColor) {
            options.setPreviewTopBgColor(topBgColor);
            return this;
        }

        public Builder setPreviewBottomBgColor(int previewBottomBgColor) {
            options.setPreviewBottomBgColor(previewBottomBgColor);
            return this;
        }

        public Builder setCompressQuality(int compressQuality) {
            options.setCompressQuality(compressQuality);
            return this;
        }

        public Builder setSelectMedia(List<LocalMedia> selectMedia) {
            if (options.getSelectMode() == FunctionConfig.MODE_SINGLE) {
                selectMedia = new ArrayList<>();
                options.setSelectMedia(selectMedia);
            } else {
                options.setSelectMedia(selectMedia);
            }
            return this;
        }

        public Builder setCompressFlag(int compressFlag) {
            options.setCompressFlag(compressFlag);
            return this;
        }

        public Builder setCompressW(int compressW) {
            options.setCompressW(compressW);
            return this;
        }

        public Builder setCompressH(int compressH) {
            options.setCompressH(compressH);
            return this;
        }

        public Builder setGrade(int grade) {
            options.setGrade(grade);
            return this;
        }

        public Builder setCustomQQ_theme(int qq_theme) {
            options.setCustomQQ_theme(qq_theme);
            return this;
        }

        public Builder setMaxB(int maxB) {
            options.setMaxB(maxB);
            return this;
        }

        public Builder setEnablePixelCompress(boolean enablePixelCompress) {
            options.setEnablePixelCompress(enablePixelCompress);
            return this;
        }

        public Builder setEnableQualityCompress(boolean enableQualityCompress) {
            options.setEnableQualityCompress(enableQualityCompress);
            return this;
        }


        public Builder setStatusBar(int statusBar) {
            options.setStatusBar(statusBar);
            return this;
        }

        public Builder setImmersive(boolean immersive) {
            options.setImmersive(immersive);
            return this;
        }

        public Builder setPicture_title_color(int title_color) {
            options.setPicture_title_color(title_color);
            return this;
        }

        public Builder setPicture_right_color(int right_color) {
            options.setPicture_right_color(right_color);
            return this;
        }

        public Builder setLeftBackDrawable(int leftBackDrawable) {
            options.setLeftBackDrawable(leftBackDrawable);
            return this;
        }

        public Builder setNumComplete(boolean numComplete) {
            options.setNumComplete(numComplete);
            return this;
        }

        public Builder setClickVideo(boolean isClickVideo) {
            options.setClickVideo(isClickVideo);
            return this;
        }

        public FunctionOptions create() {
            return options;
        }
    }
}
