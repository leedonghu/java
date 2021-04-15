package p08.textbook.s080302;

import p08.textbook.s080205.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};
		System.out.println(rc.MAX_VOLUME);
		System.out.println(rc.MIN_VOLUME);
		rc.setMute(true);
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
	}
}
