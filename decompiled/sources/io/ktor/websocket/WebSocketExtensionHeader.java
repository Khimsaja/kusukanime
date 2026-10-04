package io.ktor.websocket;

import P3.q;
import e3.c;
import io.ktor.http.ContentDisposition;
import io.ktor.network.sockets.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y5.h;
import y5.k;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionHeader;", "", "", ContentDisposition.Parameters.Name, "", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "parametersToString", "()Ljava/lang/String;", "Ly5/h;", "LO3/l;", "parseParameters", "()Ly5/h;", "toString", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebSocketExtensionHeader {
    private final String name;
    private final List<String> parameters;

    public WebSocketExtensionHeader(String str, List<String> list) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("parameters", list);
        this.name = str;
        this.parameters = list;
    }

    private final String parametersToString() {
        if (this.parameters.isEmpty()) {
            return "";
        }
        return "; " + q.y0(this.parameters, ";", null, null, null, 62);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O3.l parseParameters$lambda$0(String str) {
        l.f("it", str);
        int iD0 = AbstractC2510o.d0(str, '=', 0, 6);
        String strSubstring = "";
        if (iD0 < 0) {
            return new O3.l(str, "");
        }
        String strZ0 = AbstractC2510o.z0(str, c.L(0, iD0));
        int i7 = iD0 + 1;
        if (i7 < str.length()) {
            strSubstring = str.substring(i7);
            l.e("substring(...)", strSubstring);
        }
        return new O3.l(strZ0, strSubstring);
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getParameters() {
        return this.parameters;
    }

    public final h parseParameters() {
        return k.U(q.l0(this.parameters), new b(14));
    }

    public String toString() {
        return this.name + ' ' + parametersToString();
    }
}
