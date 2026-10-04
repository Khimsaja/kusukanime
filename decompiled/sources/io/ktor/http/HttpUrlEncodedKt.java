package io.ktor.http;

import O3.l;
import P3.q;
import P3.r;
import P3.v;
import io.ktor.client.utils.CIOKt;
import io.ktor.http.Parameters;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import z5.AbstractC2510o;
import z5.C2496a;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\u0000*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n0\t¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0011\u001a\u00020\u0010*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n0\t2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u000b\u001a\u00020\u0000*\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0013\u001a\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0014\u001a\u001f\u0010\u0011\u001a\u00020\u0010*\u00020\u00152\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0016\u001a7\u0010\u0011\u001a\u00020\u0010*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t0\u00180\u00172\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "defaultEncoding", "", "limit", "Lio/ktor/http/Parameters;", "parseUrlEncodedParameters", "(Ljava/lang/String;Ljava/nio/charset/Charset;I)Lio/ktor/http/Parameters;", "", "LO3/l;", "formUrlEncode", "(Ljava/util/List;)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "LO3/C;", "formUrlEncodeTo", "(Ljava/util/List;Ljava/lang/Appendable;)V", "(Lio/ktor/http/Parameters;)Ljava/lang/String;", "(Lio/ktor/http/Parameters;Ljava/lang/Appendable;)V", "Lio/ktor/http/ParametersBuilder;", "(Lio/ktor/http/ParametersBuilder;Ljava/lang/Appendable;)V", "", "", "(Ljava/util/Set;Ljava/lang/Appendable;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpUrlEncodedKt {
    public static final String formUrlEncode(List<l> list) throws IOException {
        kotlin.jvm.internal.l.f("<this>", list);
        StringBuilder sb = new StringBuilder();
        formUrlEncodeTo(list, sb);
        return sb.toString();
    }

    public static final void formUrlEncodeTo(List<l> list, Appendable appendable) throws IOException {
        kotlin.jvm.internal.l.f("<this>", list);
        kotlin.jvm.internal.l.f("out", appendable);
        q.x0(list, appendable, "&", null, null, new io.ktor.client.request.a(18), 60);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formUrlEncodeTo$lambda$5(l lVar) {
        kotlin.jvm.internal.l.f("it", lVar);
        String strEncodeURLParameter = CodecsKt.encodeURLParameter((String) lVar.f7528k, true);
        Object obj = lVar.f7529l;
        if (obj == null) {
            return strEncodeURLParameter;
        }
        return strEncodeURLParameter + '=' + CodecsKt.encodeURLParameterValue(String.valueOf(obj));
    }

    public static final Parameters parseUrlEncodedParameters(String str, Charset charset, int i7) {
        Object next;
        String name;
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("defaultEncoding", charset);
        List<String> listU0 = AbstractC2510o.u0(str, new String[]{"&"}, i7, 2);
        ArrayList arrayList = new ArrayList(r.p(listU0, 10));
        for (String str2 : listU0) {
            arrayList.add(new l(AbstractC2510o.F0(str2, "="), AbstractC2510o.B0(str2, "=", "")));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.a(((l) next).f7528k, "_charset_")) {
                break;
            }
        }
        l lVar = (l) next;
        if (lVar == null || (name = (String) lVar.f7529l) == null) {
            name = CharsetJVMKt.getName(charset);
        }
        Charset charsetForName = CharsetJVMKt.forName(C2496a.a, name);
        Parameters.Companion companion = Parameters.INSTANCE;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l lVar2 = (l) it2.next();
            parametersBuilderParametersBuilder$default.append(CodecsKt.decodeURLQueryComponent$default((String) lVar2.f7528k, 0, 0, false, charsetForName, 7, null), CodecsKt.decodeURLQueryComponent$default((String) lVar2.f7529l, 0, 0, false, charsetForName, 7, null));
        }
        return parametersBuilderParametersBuilder$default.build();
    }

    public static /* synthetic */ Parameters parseUrlEncodedParameters$default(String str, Charset charset, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = C2496a.f19036b;
        }
        if ((i8 & 2) != 0) {
            i7 = CIOKt.DEFAULT_HTTP_POOL_SIZE;
        }
        return parseUrlEncodedParameters(str, charset, i7);
    }

    public static final String formUrlEncode(Parameters parameters) {
        kotlin.jvm.internal.l.f("<this>", parameters);
        Set<Map.Entry<String, List<String>>> setEntries = parameters.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(r.p(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new l(entry.getKey(), (String) it2.next()));
            }
            v.e0(arrayList, arrayList2);
        }
        return formUrlEncode(arrayList);
    }

    public static final void formUrlEncodeTo(Parameters parameters, Appendable appendable) throws IOException {
        kotlin.jvm.internal.l.f("<this>", parameters);
        kotlin.jvm.internal.l.f("out", appendable);
        formUrlEncodeTo(parameters.entries(), appendable);
    }

    public static final void formUrlEncodeTo(ParametersBuilder parametersBuilder, Appendable appendable) throws IOException {
        kotlin.jvm.internal.l.f("<this>", parametersBuilder);
        kotlin.jvm.internal.l.f("out", appendable);
        formUrlEncodeTo(parametersBuilder.entries(), appendable);
    }

    public static final void formUrlEncodeTo(Set<? extends Map.Entry<String, ? extends List<String>>> set, Appendable appendable) throws IOException {
        List listH;
        kotlin.jvm.internal.l.f("<this>", set);
        kotlin.jvm.internal.l.f("out", appendable);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listH = r.H(new l(str, null));
            } else {
                ArrayList arrayList2 = new ArrayList(r.p(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new l(str, (String) it2.next()));
                }
                listH = arrayList2;
            }
            v.e0(arrayList, listH);
        }
        formUrlEncodeTo(arrayList, appendable);
    }
}
