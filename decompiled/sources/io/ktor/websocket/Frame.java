package io.ktor.websocket;

import D6.r;
import H5.N;
import S5.n;
import S5.p;
import b1.AbstractC0703b;
import io.ktor.http.ContentType;
import io.ktor.util.NIOKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 (2\u00020\u0001:\u0006)*+,-(BI\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b!\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0001\u0005./012¨\u00063"}, d2 = {"Lio/ktor/websocket/Frame;", "", "", "fin", "Lio/ktor/websocket/FrameType;", "frameType", "", "data", "LH5/N;", "disposableHandle", "rsv1", "rsv2", "rsv3", "<init>", "(ZLio/ktor/websocket/FrameType;[BLH5/N;ZZZ)V", "", "toString", "()Ljava/lang/String;", "copy", "()Lio/ktor/websocket/Frame;", "Z", "getFin", "()Z", "Lio/ktor/websocket/FrameType;", "getFrameType", "()Lio/ktor/websocket/FrameType;", "[B", "getData", "()[B", "LH5/N;", "getDisposableHandle", "()LH5/N;", "getRsv1", "getRsv2", "getRsv3", "Ljava/nio/ByteBuffer;", "buffer", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "Companion", "Binary", "Text", "Close", "Ping", "Pong", "Lio/ktor/websocket/Frame$Binary;", "Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/Frame$Ping;", "Lio/ktor/websocket/Frame$Pong;", "Lio/ktor/websocket/Frame$Text;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Frame {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] Empty = new byte[0];
    private final ByteBuffer buffer;
    private final byte[] data;
    private final N disposableHandle;
    private final boolean fin;
    private final FrameType frameType;
    private final boolean rsv1;
    private final boolean rsv2;
    private final boolean rsv3;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/websocket/Frame$Binary;", "Lio/ktor/websocket/Frame;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "Ljava/nio/ByteBuffer;", "buffer", "(ZLjava/nio/ByteBuffer;)V", "(Z[B)V", "LS5/n;", "packet", "(ZLS5/n;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Binary extends Frame {
        public /* synthetic */ Binary(boolean z7, byte[] bArr, boolean z8, boolean z9, boolean z10, int i7, f fVar) {
            this(z7, bArr, (i7 & 4) != 0 ? false : z8, (i7 & 8) != 0 ? false : z9, (i7 & 16) != 0 ? false : z10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z7, byte[] bArr, boolean z8, boolean z9, boolean z10) {
            super(z7, FrameType.BINARY, bArr, NonDisposableHandle.INSTANCE, z8, z9, z10, null);
            l.f("data", bArr);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z7, ByteBuffer byteBuffer) {
            this(z7, NIOKt.moveToByteArray(byteBuffer));
            l.f("buffer", byteBuffer);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z7, byte[] bArr) {
            this(z7, bArr, false, false, false);
            l.f("data", bArr);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z7, n nVar) {
            this(z7, p.j(nVar, -1));
            l.f("packet", nVar);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/Frame;", "", "data", "<init>", "([B)V", "Lio/ktor/websocket/CloseReason;", "reason", "(Lio/ktor/websocket/CloseReason;)V", "LS5/n;", "packet", "(LS5/n;)V", "()V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Close extends Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Close(byte[] bArr) {
            super(true, FrameType.CLOSE, bArr, NonDisposableHandle.INSTANCE, false, false, false, null);
            l.f("data", bArr);
        }

        public Close() {
            this(Frame.Empty);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(ByteBuffer byteBuffer) {
            this(NIOKt.moveToByteArray(byteBuffer));
            l.f("buffer", byteBuffer);
        }

        public Close(CloseReason closeReason) {
            l.f("reason", closeReason);
            S5.a aVar = new S5.a();
            aVar.o(closeReason.getCode());
            StringsKt.writeText$default(aVar, closeReason.getMessage(), 0, 0, (Charset) null, 14, (Object) null);
            this(aVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(n nVar) {
            this(p.j(nVar, -1));
            l.f("packet", nVar);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/websocket/Frame$Companion;", "", "<init>", "()V", "", "fin", "Lio/ktor/websocket/FrameType;", "frameType", "", "data", "rsv1", "rsv2", "rsv3", "Lio/ktor/websocket/Frame;", "byType", "(ZLio/ktor/websocket/FrameType;[BZZZ)Lio/ktor/websocket/Frame;", "Empty", "[B", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FrameType.values().length];
                try {
                    iArr[FrameType.BINARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FrameType.TEXT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FrameType.CLOSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FrameType.PING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FrameType.PONG.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Frame byType(boolean fin, FrameType frameType, byte[] data, boolean rsv1, boolean rsv2, boolean rsv3) {
            l.f("frameType", frameType);
            l.f("data", data);
            int i7 = WhenMappings.$EnumSwitchMapping$0[frameType.ordinal()];
            if (i7 == 1) {
                return new Binary(fin, data, rsv1, rsv2, rsv3);
            }
            if (i7 == 2) {
                return new Text(fin, data, rsv1, rsv2, rsv3);
            }
            if (i7 == 3) {
                return new Close(data);
            }
            if (i7 == 4) {
                return new Ping(data);
            }
            if (i7 == 5) {
                return new Pong(data, NonDisposableHandle.INSTANCE);
            }
            throw new r();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/websocket/Frame$Ping;", "Lio/ktor/websocket/Frame;", "", "data", "<init>", "([B)V", "LS5/n;", "packet", "(LS5/n;)V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Ping extends Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ping(byte[] bArr) {
            super(true, FrameType.PING, bArr, NonDisposableHandle.INSTANCE, false, false, false, null);
            l.f("data", bArr);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(ByteBuffer byteBuffer) {
            this(NIOKt.moveToByteArray(byteBuffer));
            l.f("buffer", byteBuffer);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(n nVar) {
            this(p.j(nVar, -1));
            l.f("packet", nVar);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/websocket/Frame$Text;", "Lio/ktor/websocket/Frame;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", "", ContentType.Text.TYPE, "(Ljava/lang/String;)V", "LS5/n;", "packet", "(ZLS5/n;)V", "Ljava/nio/ByteBuffer;", "buffer", "(ZLjava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text extends Frame {
        public /* synthetic */ Text(boolean z7, byte[] bArr, boolean z8, boolean z9, boolean z10, int i7, f fVar) {
            this(z7, bArr, (i7 & 4) != 0 ? false : z8, (i7 & 8) != 0 ? false : z9, (i7 & 16) != 0 ? false : z10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(boolean z7, byte[] bArr, boolean z8, boolean z9, boolean z10) {
            super(z7, FrameType.TEXT, bArr, NonDisposableHandle.INSTANCE, z8, z9, z10, null);
            l.f("data", bArr);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z7, byte[] bArr) {
            this(z7, bArr, false, false, false);
            l.f("data", bArr);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(String str) {
            this(true, StringsKt.toByteArray$default(str, null, 1, null));
            l.f(ContentType.Text.TYPE, str);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z7, ByteBuffer byteBuffer) {
            this(z7, NIOKt.moveToByteArray(byteBuffer));
            l.f("buffer", byteBuffer);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z7, n nVar) {
            this(z7, p.j(nVar, -1));
            l.f("packet", nVar);
        }
    }

    public /* synthetic */ Frame(boolean z7, FrameType frameType, byte[] bArr, N n7, boolean z8, boolean z9, boolean z10, f fVar) {
        this(z7, frameType, bArr, n7, z8, z9, z10);
    }

    public final Frame copy() {
        Companion companion = INSTANCE;
        boolean z7 = this.fin;
        FrameType frameType = this.frameType;
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        l.e("copyOf(...)", bArrCopyOf);
        return companion.byType(z7, frameType, bArrCopyOf, this.rsv1, this.rsv2, this.rsv3);
    }

    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final N getDisposableHandle() {
        return this.disposableHandle;
    }

    public final boolean getFin() {
        return this.fin;
    }

    public final FrameType getFrameType() {
        return this.frameType;
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

    public String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.frameType);
        sb.append(" (fin=");
        sb.append(this.fin);
        sb.append(", buffer len = ");
        return AbstractC0703b.l(sb, this.data.length, ')');
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/Frame$Pong;", "Lio/ktor/websocket/Frame;", "", "data", "LH5/N;", "disposableHandle", "<init>", "([BLH5/N;)V", "LS5/n;", "packet", "(LS5/n;)V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;LH5/N;)V", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pong extends Frame {
        public /* synthetic */ Pong(byte[] bArr, N n7, int i7, f fVar) {
            this(bArr, (i7 & 2) != 0 ? NonDisposableHandle.INSTANCE : n7);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pong(byte[] bArr, N n7) {
            super(true, FrameType.PONG, bArr, n7, false, false, false, null);
            l.f("data", bArr);
            l.f("disposableHandle", n7);
        }

        public /* synthetic */ Pong(ByteBuffer byteBuffer, N n7, int i7, f fVar) {
            this(byteBuffer, (i7 & 2) != 0 ? NonDisposableHandle.INSTANCE : n7);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(ByteBuffer byteBuffer, N n7) {
            this(NIOKt.moveToByteArray(byteBuffer), n7);
            l.f("buffer", byteBuffer);
            l.f("disposableHandle", n7);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(ByteBuffer byteBuffer) {
            this(NIOKt.moveToByteArray(byteBuffer), NonDisposableHandle.INSTANCE);
            l.f("buffer", byteBuffer);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(n nVar) {
            this(p.j(nVar, -1), NonDisposableHandle.INSTANCE);
            l.f("packet", nVar);
        }
    }

    private Frame(boolean z7, FrameType frameType, byte[] bArr, N n7, boolean z8, boolean z9, boolean z10) {
        this.fin = z7;
        this.frameType = frameType;
        this.data = bArr;
        this.disposableHandle = n7;
        this.rsv1 = z8;
        this.rsv2 = z9;
        this.rsv3 = z10;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        l.e("wrap(...)", byteBufferWrap);
        this.buffer = byteBufferWrap;
    }

    public /* synthetic */ Frame(boolean z7, FrameType frameType, byte[] bArr, N n7, boolean z8, boolean z9, boolean z10, int i7, f fVar) {
        this(z7, frameType, bArr, (i7 & 8) != 0 ? NonDisposableHandle.INSTANCE : n7, (i7 & 16) != 0 ? false : z8, (i7 & 32) != 0 ? false : z9, (i7 & 64) != 0 ? false : z10, null);
    }
}
