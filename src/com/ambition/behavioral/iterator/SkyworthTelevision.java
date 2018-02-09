package com.ambition.behavioral.iterator;

public class SkyworthTelevision implements Television {
	private Object[] obj = {"CCTV-1","CCTV-2","CCTV-3","CCTV-4","CCTV-5","CCTV-6","CCTV-7","CCTV-8"};

	@Override
	public TVIterator createiIterator() {
		return new SkyworthIterator();
	}
	
	public class SkyworthIterator implements TVIterator {

		private int currentIndex = 0;
		
		@Override
		public void setChannel(int i) {
			currentIndex = i;
		}

		@Override
		public void next() {
			if (currentIndex<obj.length) {
				currentIndex++;
			}
		}

		@Override
		public void previous() {
			if (currentIndex>0) {
				currentIndex--;
			}
		}

		@Override
		public boolean isLast() {
			return currentIndex == obj.length;
		}

		@Override
		public Object currentChannel() {
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {
			return currentIndex == 0;
		}

	}
	
}
