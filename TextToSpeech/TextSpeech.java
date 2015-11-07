import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

class TextSpeech {
	private static final String VOICENAME = "kevin16";                                        
	public void mySpeak(String text)
	{
	Voice voice;
	VoiceManager vm = VoiceManager.getInstance();
	voice = vm.getVoice(VOICENAME);
	voice.allocate();
	try{
	voice.speak(text);
	}catch(Exception e){}
	} 

}
