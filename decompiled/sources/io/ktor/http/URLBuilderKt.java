package io.ktor.http;

import O3.C;
import O3.InterfaceC0554c;
import P3.m;
import P3.q;
import P3.r;
import P3.v;
import P3.y;
import e4.k;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a)\u0010\u0005\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000e\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\n*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0017\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0017\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0019\"\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u001b\u001a%\u0010\u001c\u001a\u00020\n*\u00020\u00032\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0019\"\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\u001e\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0019\"\u00020\u0007¢\u0006\u0004\b\u001e\u0010 \u001a\u0019\u0010!\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0002¢\u0006\u0004\b!\u0010\"\u001aW\u0010(\u001a\u00020\n*\u00020\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0&¢\u0006\u0004\b(\u0010)\u001a'\u0010*\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0019\"\u00020\u0007H\u0007¢\u0006\u0004\b*\u0010 \u001a!\u0010*\u001a\u00020\u0003*\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0007¢\u0006\u0004\b*\u0010\u001f\"\u0014\u0010+\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0018\u0010/\u001a\u00020\u0007*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0015\u00101\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010.\"(\u0010\r\u001a\u00020\u0007*\u00020\u00032\u0006\u00102\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010.\"\u0004\b4\u00105¨\u00066"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "Lio/ktor/http/URLBuilder;", "out", "appendTo", "(Lio/ktor/http/URLBuilder;Ljava/lang/Appendable;)Ljava/lang/Appendable;", "", "encodedUser", "host", "LO3/C;", "appendMailto", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;)V", "encodedPath", "appendFile", "appendPayload", "(Ljava/lang/Appendable;Ljava/lang/String;)V", "clone", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "", "segments", "", "encodeSlash", "appendPathSegments", "(Lio/ktor/http/URLBuilder;Ljava/util/List;Z)Lio/ktor/http/URLBuilder;", "", "components", "(Lio/ktor/http/URLBuilder;[Ljava/lang/String;Z)Lio/ktor/http/URLBuilder;", "path", "(Lio/ktor/http/URLBuilder;[Ljava/lang/String;)V", "appendEncodedPathSegments", "(Lio/ktor/http/URLBuilder;Ljava/util/List;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;[Ljava/lang/String;)Lio/ktor/http/URLBuilder;", "joinPath", "(Ljava/util/List;)Ljava/lang/String;", "scheme", "", "port", "Lkotlin/Function1;", "block", "set", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le4/k;)V", "pathComponents", "DEFAULT_PORT", "I", "getEncodedUserAndPassword", "(Lio/ktor/http/URLBuilder;)Ljava/lang/String;", "encodedUserAndPassword", "getAuthority", "authority", "value", "getEncodedPath", "setEncodedPath", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URLBuilderKt {
    public static final int DEFAULT_PORT = 0;

    public static final URLBuilder appendEncodedPathSegments(URLBuilder uRLBuilder, List<String> list) {
        l.f("<this>", uRLBuilder);
        l.f("segments", list);
        boolean z7 = false;
        boolean z8 = uRLBuilder.getEncodedPathSegments().size() > 1 && ((CharSequence) q.A0(uRLBuilder.getEncodedPathSegments())).length() == 0 && !list.isEmpty();
        if (list.size() > 1 && ((CharSequence) q.r0(list)).length() == 0 && !uRLBuilder.getEncodedPathSegments().isEmpty()) {
            z7 = true;
        }
        uRLBuilder.setEncodedPathSegments((z8 && z7) ? q.G0(q.p0(uRLBuilder.getEncodedPathSegments()), q.o0(list, 1)) : z8 ? q.G0(q.p0(uRLBuilder.getEncodedPathSegments()), list) : z7 ? q.G0(uRLBuilder.getEncodedPathSegments(), q.o0(list, 1)) : q.G0(uRLBuilder.getEncodedPathSegments(), list));
        return uRLBuilder;
    }

    private static final void appendFile(Appendable appendable, String str, String str2) throws IOException {
        appendable.append("://");
        appendable.append(str);
        if (!AbstractC2510o.x0(str2, '/')) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    private static final void appendMailto(Appendable appendable, String str, String str2) throws IOException {
        appendable.append(ServerSentEventKt.COLON);
        appendable.append(str);
        appendable.append(str2);
    }

    public static final URLBuilder appendPathSegments(URLBuilder uRLBuilder, String[] strArr, boolean z7) {
        l.f("<this>", uRLBuilder);
        l.f("components", strArr);
        return appendPathSegments(uRLBuilder, (List<String>) m.u0(strArr), z7);
    }

    public static /* synthetic */ URLBuilder appendPathSegments$default(URLBuilder uRLBuilder, List list, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return appendPathSegments(uRLBuilder, (List<String>) list, z7);
    }

    private static final void appendPayload(Appendable appendable, String str) throws IOException {
        appendable.append(ServerSentEventKt.COLON);
        appendable.append(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final <A extends Appendable> A appendTo(URLBuilder uRLBuilder, A a) throws IOException {
        a.append(uRLBuilder.getProtocol().getName());
        String name = uRLBuilder.getProtocol().getName();
        switch (name.hashCode()) {
            case -1081572750:
                if (name.equals("mailto")) {
                    appendMailto(a, getEncodedUserAndPassword(uRLBuilder), uRLBuilder.getHost());
                    return a;
                }
                break;
            case 114715:
                if (name.equals("tel")) {
                    appendPayload(a, uRLBuilder.getHost());
                    return a;
                }
                break;
            case 3076010:
                if (name.equals("data")) {
                    appendPayload(a, uRLBuilder.getHost());
                    return a;
                }
                break;
            case 3143036:
                if (name.equals("file")) {
                    appendFile(a, uRLBuilder.getHost(), getEncodedPath(uRLBuilder));
                    return a;
                }
                break;
            case 92611469:
                if (name.equals("about")) {
                    appendPayload(a, uRLBuilder.getHost());
                    return a;
                }
                break;
        }
        a.append("://");
        a.append(getAuthority(uRLBuilder));
        URLUtilsKt.appendUrlFullPath(a, getEncodedPath(uRLBuilder), uRLBuilder.getEncodedParameters(), uRLBuilder.getTrailingQuery());
        if (uRLBuilder.getEncodedFragment().length() > 0) {
            a.append('#');
            a.append(uRLBuilder.getEncodedFragment());
        }
        return a;
    }

    public static final URLBuilder clone(URLBuilder uRLBuilder) {
        l.f("<this>", uRLBuilder);
        return URLUtilsKt.takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), uRLBuilder);
    }

    public static final String getAuthority(URLBuilder uRLBuilder) {
        l.f("<this>", uRLBuilder);
        StringBuilder sb = new StringBuilder();
        sb.append(getEncodedUserAndPassword(uRLBuilder));
        sb.append(uRLBuilder.getHost());
        if (uRLBuilder.getPort() != 0 && uRLBuilder.getPort() != uRLBuilder.getProtocol().getDefaultPort()) {
            sb.append(ServerSentEventKt.COLON);
            sb.append(String.valueOf(uRLBuilder.getPort()));
        }
        return sb.toString();
    }

    public static final String getEncodedPath(URLBuilder uRLBuilder) {
        l.f("<this>", uRLBuilder);
        return joinPath(uRLBuilder.getEncodedPathSegments());
    }

    public static final String getEncodedUserAndPassword(URLBuilder uRLBuilder) {
        l.f("<this>", uRLBuilder);
        StringBuilder sb = new StringBuilder();
        URLUtilsKt.appendUserAndPassword(sb, uRLBuilder.getEncodedUser(), uRLBuilder.getEncodedPassword());
        return sb.toString();
    }

    private static final String joinPath(List<String> list) {
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) q.r0(list)).length() == 0 ? "/" : (String) q.r0(list) : q.y0(list, "/", null, null, null, 62);
    }

    public static final void path(URLBuilder uRLBuilder, String... strArr) {
        l.f("<this>", uRLBuilder);
        l.f("path", strArr);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CodecsKt.encodeURLPath$default(str, false, false, 3, null));
        }
        uRLBuilder.setEncodedPathSegments(arrayList);
    }

    @InterfaceC0554c
    public static final URLBuilder pathComponents(URLBuilder uRLBuilder, String... strArr) {
        l.f("<this>", uRLBuilder);
        l.f("components", strArr);
        return appendPathSegments$default(uRLBuilder, m.u0(strArr), false, 2, (Object) null);
    }

    public static final void set(URLBuilder uRLBuilder, String str, String str2, Integer num, String str3, k kVar) {
        l.f("<this>", uRLBuilder);
        l.f("block", kVar);
        if (str != null) {
            uRLBuilder.setProtocol(URLProtocol.INSTANCE.createOrDefault(str));
        }
        if (str2 != null) {
            uRLBuilder.setHost(str2);
        }
        if (num != null) {
            uRLBuilder.setPort(num.intValue());
        }
        if (str3 != null) {
            setEncodedPath(uRLBuilder, str3);
        }
        kVar.invoke(uRLBuilder);
    }

    public static /* synthetic */ void set$default(URLBuilder uRLBuilder, String str, String str2, Integer num, String str3, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new io.ktor.client.request.a(20);
        }
        set(uRLBuilder, str, str2, num, str3, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C set$lambda$5(URLBuilder uRLBuilder) {
        l.f("<this>", uRLBuilder);
        return C.a;
    }

    public static final void setEncodedPath(URLBuilder uRLBuilder, String str) {
        l.f("<this>", uRLBuilder);
        l.f("value", str);
        uRLBuilder.setEncodedPathSegments(AbstractC2510o.g0(str) ? y.f7779k : str.equals("/") ? URLParserKt.getROOT_PATH() : q.U0(AbstractC2510o.v0(str, new char[]{'/'})));
    }

    public static final URLBuilder appendPathSegments(URLBuilder uRLBuilder, List<String> list, boolean z7) {
        l.f("<this>", uRLBuilder);
        l.f("segments", list);
        if (!z7) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                v.e0(arrayList, AbstractC2510o.v0((String) it.next(), new char[]{'/'}));
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(r.p(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(CodecsKt.encodeURLPathPart((String) it2.next()));
        }
        appendEncodedPathSegments(uRLBuilder, arrayList2);
        return uRLBuilder;
    }

    public static /* synthetic */ URLBuilder appendPathSegments$default(URLBuilder uRLBuilder, String[] strArr, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return appendPathSegments(uRLBuilder, strArr, z7);
    }

    @InterfaceC0554c
    public static final URLBuilder pathComponents(URLBuilder uRLBuilder, List<String> list) {
        l.f("<this>", uRLBuilder);
        l.f("components", list);
        return appendPathSegments$default(uRLBuilder, (List) list, false, 2, (Object) null);
    }

    public static final URLBuilder appendEncodedPathSegments(URLBuilder uRLBuilder, String... strArr) {
        l.f("<this>", uRLBuilder);
        l.f("components", strArr);
        return appendEncodedPathSegments(uRLBuilder, (List<String>) m.u0(strArr));
    }
}
