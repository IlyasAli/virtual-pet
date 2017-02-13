 import java.util.Random;

// attributes 
	public class VirtualPet {
	private int hungry = 0;
	private int thirsty = 0;
	private int sleep = 0;
	private int play = 10;

	Random random = new Random();
	public int getRandom() {
		return random.nextInt(10);
	}
	public void tick() {
		// make time pass
		hungry += (5 + getRandom());
		thirsty += (3 + getRandom());
		sleep += (2 + getRandom());
		play -= (2 + getRandom());
	}
		
    	int getHungry() {
			return hungry;
		}
		int getThirsty() {
			return thirsty;
		}
		int getTired() {
			return sleep;
		}
		int getBored() {
			return play;
		}
	
		 //Methods
	    public void feed(){
	        hungry -= 15;
	        thirsty += 5;
	    }
	    public void drink(){
	    	thirsty -= 10;
	    	play += 3;
	    }
	    public void sleep(){
	    	sleep -= 25;
	    	hungry += 5;
	    }
	    public void play(){
	    	play -= 20;
	    	sleep += 10;
	    }
		public void turtle() {
			// TODO Auto-generated method stub
			
		}
}
