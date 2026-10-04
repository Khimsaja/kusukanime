package io.ktor.websocket;

import D6.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R$\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R$\u0010 \u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010(\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u0010,\u001a\u0004\u0018\u00010\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b4\u0010\u0019¨\u00067"}, d2 = {"Lio/ktor/websocket/FrameParser;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "bb", "", "handleStep", "(Ljava/nio/ByteBuffer;)Z", "parseHeader1", "parseLength", "parseMaskKey", "LO3/C;", "bodyComplete", "frame", "(Ljava/nio/ByteBuffer;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/ktor/websocket/FrameParser$State;", "kotlin.jvm.PlatformType", "state", "Ljava/util/concurrent/atomic/AtomicReference;", "value", "fin", "Z", "getFin", "()Z", "rsv1", "getRsv1", "rsv2", "getRsv2", "rsv3", "getRsv3", "mask", "getMask", "", "opcode", "I", "lastOpcode", "lengthLength", "", "length", "J", "getLength", "()J", "maskKey", "Ljava/lang/Integer;", "getMaskKey", "()Ljava/lang/Integer;", "Lio/ktor/websocket/FrameType;", "getFrameType", "()Lio/ktor/websocket/FrameType;", "frameType", "getBodyReady", "bodyReady", "State", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FrameParser {
    private boolean fin;
    private int lastOpcode;
    private long length;
    private int lengthLength;
    private boolean mask;
    private Integer maskKey;
    private int opcode;
    private boolean rsv1;
    private boolean rsv2;
    private boolean rsv3;
    private final AtomicReference<State> state = new AtomicReference<>(State.HEADER0);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/ktor/websocket/FrameParser$State;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER0", "LENGTH", "MASK_KEY", "BODY", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ V3.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State HEADER0 = new State("HEADER0", 0);
        public static final State LENGTH = new State("LENGTH", 1);
        public static final State MASK_KEY = new State("MASK_KEY", 2);
        public static final State BODY = new State("BODY", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{HEADER0, LENGTH, MASK_KEY, BODY};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = AbstractC1420H.z(stateArr$values);
        }

        private State(String str, int i7) {
        }

        public static V3.a getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.HEADER0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.MASK_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean handleStep(ByteBuffer bb) {
        State state = this.state.get();
        l.c(state);
        int i7 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i7 == 1) {
            return parseHeader1(bb);
        }
        if (i7 == 2) {
            return parseLength(bb);
        }
        if (i7 == 3) {
            return parseMaskKey(bb);
        }
        if (i7 == 4) {
            return false;
        }
        throw new r();
    }

    private final boolean parseHeader1(ByteBuffer bb) throws ProtocolViolationException {
        int i7 = 0;
        if (bb.remaining() < 2) {
            return false;
        }
        byte b4 = bb.get();
        byte b7 = bb.get();
        this.fin = (b4 & 128) != 0;
        this.rsv1 = (b4 & 64) != 0;
        this.rsv2 = (b4 & 32) != 0;
        this.rsv3 = (b4 & 16) != 0;
        int i8 = b4 & 15;
        this.opcode = i8;
        if (i8 == 0 && this.lastOpcode == 0) {
            throw new ProtocolViolationException("Can't continue finished frames");
        }
        if (i8 == 0) {
            this.opcode = this.lastOpcode;
        } else if (this.lastOpcode != 0 && !getFrameType().getControlFrame()) {
            throw new ProtocolViolationException("Can't start new data frame before finishing previous one");
        }
        if (!getFrameType().getControlFrame()) {
            this.lastOpcode = this.fin ? 0 : this.opcode;
        } else if (!this.fin) {
            throw new ProtocolViolationException("control frames can't be fragmented");
        }
        this.mask = (b7 & 128) != 0;
        int i9 = b7 & 127;
        if (getFrameType().getControlFrame() && i9 > 125) {
            throw new ProtocolViolationException("control frames can't be larger than 125 bytes");
        }
        if (i9 == 126) {
            i7 = 2;
        } else if (i9 == 127) {
            i7 = 8;
        }
        this.lengthLength = i7;
        this.length = i7 == 0 ? i9 : 0L;
        if (i7 > 0) {
            this.state.set(State.LENGTH);
        } else if (this.mask) {
            this.state.set(State.MASK_KEY);
        } else {
            this.state.set(State.BODY);
        }
        return true;
    }

    private final boolean parseLength(ByteBuffer bb) {
        long j7;
        int iRemaining = bb.remaining();
        int i7 = this.lengthLength;
        if (iRemaining < i7) {
            return false;
        }
        if (i7 == 2) {
            j7 = bb.getShort() & 65535;
        } else {
            if (i7 != 8) {
                throw new IllegalStateException();
            }
            j7 = bb.getLong();
        }
        this.length = j7;
        this.state.set(this.mask ? State.MASK_KEY : State.BODY);
        return true;
    }

    private final boolean parseMaskKey(ByteBuffer bb) {
        if (bb.remaining() < 4) {
            return false;
        }
        this.maskKey = Integer.valueOf(bb.getInt());
        this.state.set(State.BODY);
        return true;
    }

    public final void bodyComplete() {
        AtomicReference<State> atomicReference = this.state;
        State state = State.BODY;
        State state2 = State.HEADER0;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                throw new IllegalStateException("It should be state BODY but it is " + this.state.get());
            }
        }
        this.opcode = 0;
        this.length = 0L;
        this.lengthLength = 0;
        this.maskKey = null;
    }

    public final void frame(ByteBuffer bb) {
        l.f("bb", bb);
        if (l.a(bb.order(), ByteOrder.BIG_ENDIAN)) {
            while (handleStep(bb)) {
            }
        } else {
            throw new IllegalArgumentException(("Buffer order should be BIG_ENDIAN but it is " + bb.order()).toString());
        }
    }

    public final boolean getBodyReady() {
        return this.state.get() == State.BODY;
    }

    public final boolean getFin() {
        return this.fin;
    }

    public final FrameType getFrameType() throws ProtocolViolationException {
        FrameType frameType = FrameType.INSTANCE.get(this.opcode);
        if (frameType != null) {
            return frameType;
        }
        throw new ProtocolViolationException("Unsupported opcode " + Integer.toHexString(this.opcode));
    }

    public final long getLength() {
        return this.length;
    }

    public final boolean getMask() {
        return this.mask;
    }

    public final Integer getMaskKey() {
        return this.maskKey;
    }

    public final boolean getRsv1() {
        return this.rsv1;
    }

    public final boolean getRsv2() {
        return this.rsv2;
    }

    public final boolean getRsv3() {
        return this.rsv3;
    }
}
