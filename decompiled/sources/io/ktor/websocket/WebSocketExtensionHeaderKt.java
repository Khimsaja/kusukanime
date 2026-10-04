package io.ktor.websocket;

import P3.q;
import P3.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "value", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "parseWebSocketExtensions", "(Ljava/lang/String;)Ljava/util/List;", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebSocketExtensionHeaderKt {
    public static final List<WebSocketExtensionHeader> parseWebSocketExtensions(String str) {
        l.f("value", str);
        List listU0 = AbstractC2510o.u0(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(r.p(listU0, 10));
        Iterator it = listU0.iterator();
        while (it.hasNext()) {
            List listU02 = AbstractC2510o.u0((String) it.next(), new String[]{";"}, 0, 6);
            String string = AbstractC2510o.J0((String) q.r0(listU02)).toString();
            List listO0 = q.o0(listU02, 1);
            ArrayList arrayList2 = new ArrayList(r.p(listO0, 10));
            Iterator it2 = listO0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AbstractC2510o.J0((String) it2.next()).toString());
            }
            arrayList.add(new WebSocketExtensionHeader(string, arrayList2));
        }
        return arrayList;
    }
}
