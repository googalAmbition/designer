package com.ambition.behavioral.iterator;

public class TCLTelevision implements Television {

	private Object[] obj = { "BBC-1", "BBC-2", "BBC-3", "BBC-4", "BBC-5", "BBC-6", "BBC-7", "BBC-8" };

	@Override
	public TVIterator createiIterator() {
		return new TCLIterator();
	}

	public class TCLIterator implements TVIterator {

		private int currentIndex = 0;

		@Override
		public void setChannel(int i) {
			currentIndex = i;
		}

		@Override
		public void next() {
			if (currentIndex < obj.length) {
				currentIndex++;
			}
		}

		@Override
		public void previous() {
			if (currentIndex > 0) {
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
