public class Pair<T, S>{
    private final T first;
    private final S second;

    public Pair(T first, S second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public S getSecond(){
    	return second;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.first.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Pair other = (Pair) obj;
        if (!this.first.equals(other.first)) {
            return false;
        }
        return true;
    }
}
