class SmallestInfiniteSet {

    public static PriorityQueue<Integer> pq;
    int i = 1;
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<Integer>();
    }
    public int popSmallest() {
        if(pq.size() == 0) return i++;
        return pq.poll();
    }
    public void addBack(int num) {
        if(num < i && !pq.contains(num)) pq.add(num);
    }
}
