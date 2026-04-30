package e03_event;

public class View {
	protected String name;
	private OnClikeListener clickListener;
	
	public View(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setClickListener(OnClikeListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void onClick() {
		if(clickListener != null)
			clickListener.onClick(this);
	}
	
	public static interface OnClikeListener{
		public void onClick(View view);
	}

}



