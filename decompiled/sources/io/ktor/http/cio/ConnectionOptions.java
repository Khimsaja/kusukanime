package io.ktor.http.cio;

import A3.C0006a;
import O3.l;
import P3.q;
import P3.r;
import P3.y;
import b1.AbstractC0703b;
import io.ktor.http.cio.internals.AsciiCharTree;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/ktor/http/cio/ConnectionOptions;", "", "", "close", "keepAlive", "upgrade", "", "", "extraOptions", "<init>", "(ZZZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "buildToString", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getClose", "()Z", "getKeepAlive", "getUpgrade", "Ljava/util/List;", "getExtraOptions", "()Ljava/util/List;", "Companion", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectionOptions {
    private static final ConnectionOptions Close;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConnectionOptions KeepAlive;
    private static final ConnectionOptions Upgrade;
    private static final AsciiCharTree<l> knownTypes;
    private final boolean close;
    private final List<String> extraOptions;
    private final boolean keepAlive;
    private final boolean upgrade;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/http/cio/ConnectionOptions$Companion;", "", "<init>", "()V", "", "connection", "Lio/ktor/http/cio/ConnectionOptions;", "parseSlow", "(Ljava/lang/CharSequence;)Lio/ktor/http/cio/ConnectionOptions;", "parse", "Close", "Lio/ktor/http/cio/ConnectionOptions;", "getClose", "()Lio/ktor/http/cio/ConnectionOptions;", "KeepAlive", "getKeepAlive", "Upgrade", "getUpgrade", "Lio/ktor/http/cio/internals/AsciiCharTree;", "LO3/l;", "", "knownTypes", "Lio/ktor/http/cio/internals/AsciiCharTree;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean parse$lambda$0(char c2, int i7) {
            return false;
        }

        private final ConnectionOptions parseSlow(CharSequence connection) {
            int i7;
            int length = connection.length();
            ConnectionOptions keepAlive = null;
            ArrayList arrayList = null;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                while (true) {
                    char cCharAt = connection.charAt(i8);
                    if (cCharAt != ' ' && cCharAt != ',') {
                        i9 = i8;
                        i7 = i9;
                        break;
                    }
                    i8++;
                    if (i8 >= length) {
                        i7 = i8;
                        break;
                    }
                }
                while (i7 < length) {
                    char cCharAt2 = connection.charAt(i7);
                    if (cCharAt2 == ' ' || cCharAt2 == ',') {
                        break;
                    }
                    i7++;
                }
                l lVar = (l) q.M0(ConnectionOptions.knownTypes.search(connection, i9, i7, true, new C0006a(29)));
                if (lVar == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(connection.subSequence(i9, i7).toString());
                } else {
                    Object obj = lVar.f7529l;
                    if (keepAlive == null) {
                        keepAlive = (ConnectionOptions) obj;
                    } else {
                        boolean z7 = true;
                        boolean z8 = keepAlive.getClose() || ((ConnectionOptions) obj).getClose();
                        boolean z9 = keepAlive.getKeepAlive() || ((ConnectionOptions) obj).getKeepAlive();
                        if (!keepAlive.getUpgrade() && !((ConnectionOptions) obj).getUpgrade()) {
                            z7 = false;
                        }
                        i8 = i7;
                        keepAlive = new ConnectionOptions(z8, z9, z7, y.f7779k);
                    }
                }
                i8 = i7;
            }
            if (keepAlive == null) {
                keepAlive = getKeepAlive();
            }
            return arrayList == null ? keepAlive : new ConnectionOptions(keepAlive.getClose(), keepAlive.getKeepAlive(), keepAlive.getUpgrade(), arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean parseSlow$lambda$1(char c2, int i7) {
            return false;
        }

        public final ConnectionOptions getClose() {
            return ConnectionOptions.Close;
        }

        public final ConnectionOptions getKeepAlive() {
            return ConnectionOptions.KeepAlive;
        }

        public final ConnectionOptions getUpgrade() {
            return ConnectionOptions.Upgrade;
        }

        public final ConnectionOptions parse(CharSequence connection) {
            if (connection == null) {
                return null;
            }
            List listSearch$default = AsciiCharTree.search$default(ConnectionOptions.knownTypes, connection, 0, 0, true, new b(0), 6, null);
            return listSearch$default.size() == 1 ? (ConnectionOptions) ((l) listSearch$default.get(0)).f7529l : parseSlow(connection);
        }

        private Companion() {
        }
    }

    static {
        boolean z7 = false;
        ConnectionOptions connectionOptions = new ConnectionOptions(true, z7, false, null, 14, null);
        Close = connectionOptions;
        boolean z8 = false;
        ConnectionOptions connectionOptions2 = new ConnectionOptions(z7, true, z8, null, 13, null);
        KeepAlive = connectionOptions2;
        ConnectionOptions connectionOptions3 = new ConnectionOptions(false, z8, true, null, 11, null);
        Upgrade = connectionOptions3;
        knownTypes = AsciiCharTree.INSTANCE.build(r.I(new l("close", connectionOptions), new l("keep-alive", connectionOptions2), new l("upgrade", connectionOptions3)), new io.ktor.client.request.a(23), new C0006a(28));
    }

    public ConnectionOptions() {
        this(false, false, false, null, 15, null);
    }

    private final String buildToString() throws IOException {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(this.extraOptions.size() + 3);
        if (this.close) {
            arrayList.add("close");
        }
        if (this.keepAlive) {
            arrayList.add("keep-alive");
        }
        if (this.upgrade) {
            arrayList.add("Upgrade");
        }
        if (!this.extraOptions.isEmpty()) {
            arrayList.addAll(this.extraOptions);
        }
        q.x0(arrayList, sb, null, null, null, null, 126);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int knownTypes$lambda$1(l lVar) {
        kotlin.jvm.internal.l.f("it", lVar);
        return ((String) lVar.f7528k).length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char knownTypes$lambda$2(l lVar, int i7) {
        kotlin.jvm.internal.l.f("t", lVar);
        return ((String) lVar.f7528k).charAt(i7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ConnectionOptions.class != other.getClass()) {
            return false;
        }
        ConnectionOptions connectionOptions = (ConnectionOptions) other;
        return this.close == connectionOptions.close && this.keepAlive == connectionOptions.keepAlive && this.upgrade == connectionOptions.upgrade && kotlin.jvm.internal.l.a(this.extraOptions, connectionOptions.extraOptions);
    }

    public final boolean getClose() {
        return this.close;
    }

    public final List<String> getExtraOptions() {
        return this.extraOptions;
    }

    public final boolean getKeepAlive() {
        return this.keepAlive;
    }

    public final boolean getUpgrade() {
        return this.upgrade;
    }

    public int hashCode() {
        return this.extraOptions.hashCode() + AbstractC0703b.d(AbstractC0703b.d(Boolean.hashCode(this.close) * 31, 31, this.keepAlive), 31, this.upgrade);
    }

    public String toString() {
        if (!this.extraOptions.isEmpty()) {
            return buildToString();
        }
        boolean z7 = this.close;
        return (!z7 || this.keepAlive || this.upgrade) ? (z7 || !this.keepAlive || this.upgrade) ? (!z7 && this.keepAlive && this.upgrade) ? "keep-alive, Upgrade" : buildToString() : "keep-alive" : "close";
    }

    public ConnectionOptions(boolean z7, boolean z8, boolean z9, List<String> list) {
        kotlin.jvm.internal.l.f("extraOptions", list);
        this.close = z7;
        this.keepAlive = z8;
        this.upgrade = z9;
        this.extraOptions = list;
    }

    public /* synthetic */ ConnectionOptions(boolean z7, boolean z8, boolean z9, List list, int i7, f fVar) {
        this((i7 & 1) != 0 ? false : z7, (i7 & 2) != 0 ? false : z8, (i7 & 4) != 0 ? false : z9, (i7 & 8) != 0 ? y.f7779k : list);
    }
}
