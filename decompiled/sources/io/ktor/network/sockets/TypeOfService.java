package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0006¨\u0006\u0018"}, d2 = {"Lio/ktor/network/sockets/TypeOfService;", "", "", "value", "constructor-impl", "(I)B", "LO3/s;", "(B)B", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "B", "getValue-w2LRezQ", "()B", "getIntValue-impl", "(B)I", "intValue", "Companion", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypeOfService {
    private final byte value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte UNDEFINED = m165constructorimpl((byte) 0);
    private static final byte IPTOS_LOWCOST = m165constructorimpl((byte) 2);
    private static final byte IPTOS_RELIABILITY = m165constructorimpl((byte) 4);
    private static final byte IPTOS_THROUGHPUT = m165constructorimpl((byte) 8);
    private static final byte IPTOS_LOWDELAY = m165constructorimpl((byte) 16);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lio/ktor/network/sockets/TypeOfService$Companion;", "", "<init>", "()V", "Lio/ktor/network/sockets/TypeOfService;", "UNDEFINED", "B", "getUNDEFINED-zieKYfw", "()B", "IPTOS_LOWCOST", "getIPTOS_LOWCOST-zieKYfw", "IPTOS_RELIABILITY", "getIPTOS_RELIABILITY-zieKYfw", "IPTOS_THROUGHPUT", "getIPTOS_THROUGHPUT-zieKYfw", "IPTOS_LOWDELAY", "getIPTOS_LOWDELAY-zieKYfw", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* renamed from: getIPTOS_LOWCOST-zieKYfw, reason: not valid java name */
        public final byte m174getIPTOS_LOWCOSTzieKYfw() {
            return TypeOfService.IPTOS_LOWCOST;
        }

        /* renamed from: getIPTOS_LOWDELAY-zieKYfw, reason: not valid java name */
        public final byte m175getIPTOS_LOWDELAYzieKYfw() {
            return TypeOfService.IPTOS_LOWDELAY;
        }

        /* renamed from: getIPTOS_RELIABILITY-zieKYfw, reason: not valid java name */
        public final byte m176getIPTOS_RELIABILITYzieKYfw() {
            return TypeOfService.IPTOS_RELIABILITY;
        }

        /* renamed from: getIPTOS_THROUGHPUT-zieKYfw, reason: not valid java name */
        public final byte m177getIPTOS_THROUGHPUTzieKYfw() {
            return TypeOfService.IPTOS_THROUGHPUT;
        }

        /* renamed from: getUNDEFINED-zieKYfw, reason: not valid java name */
        public final byte m178getUNDEFINEDzieKYfw() {
            return TypeOfService.UNDEFINED;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TypeOfService(byte b4) {
        this.value = b4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TypeOfService m164boximpl(byte b4) {
        return new TypeOfService(b4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m165constructorimpl(byte b4) {
        return b4;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m167equalsimpl(byte b4, Object obj) {
        return (obj instanceof TypeOfService) && b4 == ((TypeOfService) obj).m173unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m168equalsimpl0(byte b4, byte b7) {
        return b4 == b7;
    }

    /* renamed from: getIntValue-impl, reason: not valid java name */
    public static final int m169getIntValueimpl(byte b4) {
        return b4 & 255;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m170hashCodeimpl(byte b4) {
        return Byte.hashCode(b4);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m171toStringimpl(byte b4) {
        return "TypeOfService(value=" + ((Object) String.valueOf(b4 & 255)) + ')';
    }

    public boolean equals(Object other) {
        return m167equalsimpl(this.value, other);
    }

    /* renamed from: getValue-w2LRezQ, reason: not valid java name and from getter */
    public final byte getValue() {
        return this.value;
    }

    public int hashCode() {
        return m170hashCodeimpl(this.value);
    }

    public String toString() {
        return m171toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m173unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m166constructorimpl(int i7) {
        return m165constructorimpl((byte) i7);
    }
}
