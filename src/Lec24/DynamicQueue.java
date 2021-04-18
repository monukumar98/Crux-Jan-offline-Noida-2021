package Lec24;

public class DynamicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (super.isfull()) {
			int arr[] = new int[this.data.length * 2];
			for (int i = 0; i < this.size; i++) {

				int idx = (this.front + i) % this.data.length;
				arr[i] = this.data[idx];
			}
			this.data = arr;
			this.front = 0;
		}
		super.Enqueue(item);
		

	}
}
