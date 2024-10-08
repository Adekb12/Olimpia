// Generated from Olimpia.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class OlimpiaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PEGASO=1, HEC=2, ATE=3, JA=4, NUS=5, CAO=6, ECO=7, PROF=8, SIS=9, ERI=10, 
		HAR=11, LOG=12, HEFESTO=13, TEMIS=14, AFRODITE=15, ELY=16, DIO=17, HERMES=18, 
		HELIOS=19, HESTIA=20, APORIA=21, ErrorChar=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PEGASO", "HEC", "ATE", "JA", "NUS", "CAO", "ECO", "PROF", "SIS", "ERI", 
			"HAR", "LOG", "HEFESTO", "TEMIS", "AFRODITE", "ELY", "LETRA", "DIGITO", 
			"DIO", "HERMES", "HELIOS", "HESTIA", "APORIA", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "'caos'", "'eco'", "'profecia'", 
			"'sisifo'", "'eris'", "'harmonia'", "'logos'", null, null, null, "'elysium'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PEGASO", "HEC", "ATE", "JA", "NUS", "CAO", "ECO", "PROF", "SIS", 
			"ERI", "HAR", "LOG", "HEFESTO", "TEMIS", "AFRODITE", "ELY", "DIO", "HERMES", 
			"HELIOS", "HESTIA", "APORIA", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public OlimpiaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Olimpia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u00cf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000E\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0089\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0093\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00a4\b\u0012\n\u0012\f\u0012\u00a7\t\u0012\u0001\u0013\u0004"+
		"\u0013\u00aa\b\u0013\u000b\u0013\f\u0013\u00ab\u0001\u0014\u0004\u0014"+
		"\u00af\b\u0014\u000b\u0014\f\u0014\u00b0\u0001\u0014\u0001\u0014\u0004"+
		"\u0014\u00b5\b\u0014\u000b\u0014\f\u0014\u00b6\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00bf\b\u0015"+
		"\n\u0015\f\u0015\u00c2\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0005"+
		"\u0016\u00c7\b\u0016\n\u0016\f\u0016\u00ca\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0000"+
		"#\u0000%\u0011\'\u0012)\u0013+\u0014-\u0015/\u0016\u0001\u0000\u0005\u0003"+
		"\u0000*+--//\u0002\u0000<<>>\u0002\u0000AZaz\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u00dd\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0001D\u0001\u0000"+
		"\u0000\u0000\u0003F\u0001\u0000\u0000\u0000\u0005H\u0001\u0000\u0000\u0000"+
		"\u0007J\u0001\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bN\u0001"+
		"\u0000\u0000\u0000\rS\u0001\u0000\u0000\u0000\u000fW\u0001\u0000\u0000"+
		"\u0000\u0011`\u0001\u0000\u0000\u0000\u0013g\u0001\u0000\u0000\u0000\u0015"+
		"l\u0001\u0000\u0000\u0000\u0017u\u0001\u0000\u0000\u0000\u0019{\u0001"+
		"\u0000\u0000\u0000\u001b\u0088\u0001\u0000\u0000\u0000\u001d\u0092\u0001"+
		"\u0000\u0000\u0000\u001f\u0094\u0001\u0000\u0000\u0000!\u009c\u0001\u0000"+
		"\u0000\u0000#\u009e\u0001\u0000\u0000\u0000%\u00a0\u0001\u0000\u0000\u0000"+
		"\'\u00a9\u0001\u0000\u0000\u0000)\u00ae\u0001\u0000\u0000\u0000+\u00b8"+
		"\u0001\u0000\u0000\u0000-\u00c8\u0001\u0000\u0000\u0000/\u00cd\u0001\u0000"+
		"\u0000\u000012\u0005m\u0000\u000023\u0005e\u0000\u000034\u0005d\u0000"+
		"\u000045\u0005u\u0000\u000056\u0005s\u0000\u00006E\u0005a\u0000\u0000"+
		"78\u0005p\u0000\u000089\u0005o\u0000\u00009:\u0005s\u0000\u0000:;\u0005"+
		"e\u0000\u0000;<\u0005i\u0000\u0000<=\u0005d\u0000\u0000=>\u0005o\u0000"+
		"\u0000>E\u0005n\u0000\u0000?@\u0005a\u0000\u0000@A\u0005t\u0000\u0000"+
		"AB\u0005e\u0000\u0000BC\u0005n\u0000\u0000CE\u0005a\u0000\u0000D1\u0001"+
		"\u0000\u0000\u0000D7\u0001\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000"+
		"E\u0002\u0001\u0000\u0000\u0000FG\u0005(\u0000\u0000G\u0004\u0001\u0000"+
		"\u0000\u0000HI\u0005)\u0000\u0000I\u0006\u0001\u0000\u0000\u0000JK\u0005"+
		"{\u0000\u0000K\b\u0001\u0000\u0000\u0000LM\u0005}\u0000\u0000M\n\u0001"+
		"\u0000\u0000\u0000NO\u0005c\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005o"+
		"\u0000\u0000QR\u0005s\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005e"+
		"\u0000\u0000TU\u0005c\u0000\u0000UV\u0005o\u0000\u0000V\u000e\u0001\u0000"+
		"\u0000\u0000WX\u0005p\u0000\u0000XY\u0005r\u0000\u0000YZ\u0005o\u0000"+
		"\u0000Z[\u0005f\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005c\u0000\u0000"+
		"]^\u0005i\u0000\u0000^_\u0005a\u0000\u0000_\u0010\u0001\u0000\u0000\u0000"+
		"`a\u0005s\u0000\u0000ab\u0005i\u0000\u0000bc\u0005s\u0000\u0000cd\u0005"+
		"i\u0000\u0000de\u0005f\u0000\u0000ef\u0005o\u0000\u0000f\u0012\u0001\u0000"+
		"\u0000\u0000gh\u0005e\u0000\u0000hi\u0005r\u0000\u0000ij\u0005i\u0000"+
		"\u0000jk\u0005s\u0000\u0000k\u0014\u0001\u0000\u0000\u0000lm\u0005h\u0000"+
		"\u0000mn\u0005a\u0000\u0000no\u0005r\u0000\u0000op\u0005m\u0000\u0000"+
		"pq\u0005o\u0000\u0000qr\u0005n\u0000\u0000rs\u0005i\u0000\u0000st\u0005"+
		"a\u0000\u0000t\u0016\u0001\u0000\u0000\u0000uv\u0005l\u0000\u0000vw\u0005"+
		"o\u0000\u0000wx\u0005g\u0000\u0000xy\u0005o\u0000\u0000yz\u0005s\u0000"+
		"\u0000z\u0018\u0001\u0000\u0000\u0000{|\u0007\u0000\u0000\u0000|\u001a"+
		"\u0001\u0000\u0000\u0000}~\u0005n\u0000\u0000~\u007f\u0005e\u0000\u0000"+
		"\u007f\u0080\u0005m\u0000\u0000\u0080\u0081\u0005e\u0000\u0000\u0081\u0082"+
		"\u0005s\u0000\u0000\u0082\u0083\u0005i\u0000\u0000\u0083\u0089\u0005s"+
		"\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005r\u0000\u0000"+
		"\u0086\u0087\u0005o\u0000\u0000\u0087\u0089\u0005s\u0000\u0000\u0088}"+
		"\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000\u0000\u0000\u0089\u001c"+
		"\u0001\u0000\u0000\u0000\u008a\u0093\u0007\u0001\u0000\u0000\u008b\u008c"+
		"\u0005>\u0000\u0000\u008c\u0093\u0005=\u0000\u0000\u008d\u008e\u0005<"+
		"\u0000\u0000\u008e\u0093\u0005=\u0000\u0000\u008f\u0093\u0005=\u0000\u0000"+
		"\u0090\u0091\u0005!\u0000\u0000\u0091\u0093\u0005=\u0000\u0000\u0092\u008a"+
		"\u0001\u0000\u0000\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0092\u008d"+
		"\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u001e\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005e\u0000\u0000\u0095\u0096\u0005l\u0000\u0000\u0096\u0097\u0005y"+
		"\u0000\u0000\u0097\u0098\u0005s\u0000\u0000\u0098\u0099\u0005i\u0000\u0000"+
		"\u0099\u009a\u0005u\u0000\u0000\u009a\u009b\u0005m\u0000\u0000\u009b "+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0002\u0000\u0000\u009d\"\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0007\u0003\u0000\u0000\u009f$\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a5\u0003!\u0010\u0000\u00a1\u00a4\u0003#\u0011\u0000"+
		"\u00a2\u00a4\u0003!\u0010\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"&\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0003#\u0011\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac(\u0001\u0000\u0000\u0000\u00ad\u00af\u0003#\u0011"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005.\u0000\u0000"+
		"\u00b3\u00b5\u0003#\u0011\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7*\u0001\u0000\u0000\u0000\u00b8\u00c0"+
		"\u0005\"\u0000\u0000\u00b9\u00bf\u0003!\u0010\u0000\u00ba\u00bf\u0003"+
		"#\u0011\u0000\u00bb\u00bf\u0005 \u0000\u0000\u00bc\u00bd\u0005\\\u0000"+
		"\u0000\u00bd\u00bf\t\u0000\u0000\u0000\u00be\u00b9\u0001\u0000\u0000\u0000"+
		"\u00be\u00ba\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005\"\u0000\u0000\u00c4,\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c7\u0007\u0004\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0006\u0016\u0000\u0000\u00cc"+
		".\u0001\u0000\u0000\u0000\u00cd\u00ce\t\u0000\u0000\u0000\u00ce0\u0001"+
		"\u0000\u0000\u0000\f\u0000D\u0088\u0092\u00a3\u00a5\u00ab\u00b0\u00b6"+
		"\u00be\u00c0\u00c8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}