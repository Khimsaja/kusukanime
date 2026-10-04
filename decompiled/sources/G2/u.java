package G2;

import android.net.Uri;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f2735m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, int i7) {
        super(0);
        this.f2734l = i7;
        this.f2735m = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [O3.i, java.lang.Object] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        List list;
        switch (this.f2734l) {
            case 0:
                O3.l lVar = (O3.l) this.f2735m.f2746h.getValue();
                return (lVar == null || (list = (List) lVar.f7528k) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f2735m.a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                kotlin.jvm.internal.l.c(fragment);
                w.a(fragment, arrayList, sb);
                String string = sb.toString();
                kotlin.jvm.internal.l.e("fragRegex.toString()", string);
                return new O3.l(arrayList, string);
            case 2:
                String str2 = (String) this.f2735m.f2748j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                O3.l lVar2 = (O3.l) this.f2735m.f2746h.getValue();
                if (lVar2 != null) {
                    return (String) lVar2.f7529l;
                }
                return null;
            case GzipHeaderFlags.EXTRA /* 4 */:
                String str3 = this.f2735m.a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                this.f2735m.getClass();
                return null;
            case 6:
                String str4 = this.f2735m.f2741c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                w wVar = this.f2735m;
                wVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) wVar.f2743e.getValue()).booleanValue()) {
                    String str5 = wVar.a;
                    Uri uri = Uri.parse(str5);
                    for (String str6 : uri.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str6);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str6 + " must only be present once in " + str5 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str7 = (String) P3.q.t0(queryParameters);
                        if (str7 == null) {
                            wVar.f2745g = true;
                            str7 = str6;
                        }
                        Matcher matcher = w.f2739n.matcher(str7);
                        t tVar = new t();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", strGroup);
                            tVar.f2733b.add(strGroup);
                            kotlin.jvm.internal.l.e("queryParam", str7);
                            String strSubstring = str7.substring(iEnd, matcher.start());
                            kotlin.jvm.internal.l.e("substring(...)", strSubstring);
                            sb2.append(Pattern.quote(strSubstring));
                            sb2.append("(.+?)?");
                            iEnd = matcher.end();
                        }
                        if (iEnd < str7.length()) {
                            String strSubstring2 = str7.substring(iEnd);
                            kotlin.jvm.internal.l.e("substring(...)", strSubstring2);
                            sb2.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb2.toString();
                        kotlin.jvm.internal.l.e("argRegex.toString()", string2);
                        tVar.a = AbstractC2517v.R(string2, ".*", "\\E.*\\Q");
                        kotlin.jvm.internal.l.e("paramName", str6);
                        linkedHashMap.put(str6, tVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
