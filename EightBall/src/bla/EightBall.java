package bla;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class EightBall {
	private static EightBall eightBall = null;
	
	private State certain;
	private State withoutDoubt;
	private State definitely;
	private State mostLikely;
	private State hazy;
	private State askLater;
	private State notNow;
	private State no;
	private State sourcesNo;
	private State doubtfull;
	
	private State currentState;
	

	private Queue<Integer> lastTen;
	
	
	private Random random;
	
	private EightBall(){
		this.certain = new Certain();
		this.withoutDoubt = new WithoutDoubt();
		this.definitely = new Definitely();
		this.mostLikely = new MostLikely();
		this.hazy = new Hazy();
		this.askLater = new AskLater();
		this.notNow = new NotNow();
		this.no = new No();
		this.sourcesNo = new SourcesNo();
		this.doubtfull = new Doubtfull();
		
		this.lastTen = new LinkedList<Integer>();
		this.random = new Random();
	}
	
	
	public State getCurrentState(){
		return currentState;
	}	
	public static EightBall getInstance(){
		if(eightBall == null){
			eightBall = new EightBall();
		}
		return eightBall;
	}
	
	private int GetRandom(){
		
		int r = 100000;
		while(!lastTen.contains(r)){
			r = random.nextInt(10);
			if(lastTen.size() != 10){
				lastTen.add(r);
			}
			else{
				lastTen.remove();
				lastTen.add(r);
			}
		}
		return r;
		
	}
	
	public void GetAnswer(){
		int r = GetRandom();
		
		
		switch(r) {
		case 0 : currentState = certain;
		break;
		case 1 : currentState = withoutDoubt;
		break;
		case 2 : currentState = definitely;
		break;
		case 3 : currentState = mostLikely;
		break;
		case 4 : currentState = hazy;
		break;
		case 5 : currentState = askLater;
		break;
		case 6 : currentState = notNow;
		break;
		case 7 : currentState = no;
		break;
		case 8 : currentState = sourcesNo;
		break;
		case 9 : currentState = doubtfull;
		break;
		
		}

		currentState.Answer();
	}
}

