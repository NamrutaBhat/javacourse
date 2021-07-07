package com.xworkz.image_gallery.beans;

public class ImageGalleryBeans {
	private int imageId;
	private String imageType;
	private String imgSize;
	private String date;
	
	public ImageGalleryBeans()
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getImgSize() {
		return imgSize;
	}

	public void setImgSize(String imgSize) {
		this.imgSize = imgSize;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ImageGalleryBeans [imageId=" + imageId + ", imageType=" + imageType + ", imgSize=" + imgSize + ", date="
				+ date + "]";
	}

	
	
}
