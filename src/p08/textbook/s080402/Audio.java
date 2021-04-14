package p08.textbook.s080402;

import p08.textbook.s080205.RemoteControl;

public class Audio implements RemoteControl {
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;  
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 audio 볼륨: " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("audio 무음 처리합니다.");
		} else {
			System.out.println("audio 무음 해제합니다.");
		}
	}

}
