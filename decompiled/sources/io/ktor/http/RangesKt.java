package io.ktor.http;

import P3.m;
import P3.q;
import P3.r;
import io.ktor.http.ContentRange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k4.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0005*\b\u0012\u0004\u0012\u00020\t0\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "rangeSpec", "Lio/ktor/http/RangesSpecifier;", "parseRangesSpecifier", "(Ljava/lang/String;)Lio/ktor/http/RangesSpecifier;", "", "Lio/ktor/http/ContentRange;", "", "contentLength", "Lk4/j;", "toLongRanges", "(Ljava/util/List;J)Ljava/util/List;", "mergeRangesKeepOrder", "(Ljava/util/List;)Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RangesKt {
    public static final List<j> mergeRangesKeepOrder(List<j> list) {
        l.f("<this>", list);
        List<j> listO0 = q.O0(list, new Comparator() { // from class: io.ktor.http.RangesKt$mergeRangesKeepOrder$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                return z1.c.h(Long.valueOf(((j) t7).f12680k), Long.valueOf(((j) t8).f12680k));
            }
        });
        ArrayList arrayList = new ArrayList(list.size());
        for (j jVar : listO0) {
            if (arrayList.isEmpty()) {
                arrayList.add(jVar);
            } else if (((j) q.A0(arrayList)).f12681l < jVar.f12680k - 1) {
                arrayList.add(jVar);
            } else {
                j jVar2 = (j) q.A0(arrayList);
                arrayList.set(r.y(arrayList), new j(jVar2.f12680k, Math.max(jVar2.f12681l, jVar.f12681l)));
            }
        }
        j[] jVarArr = new j[list.size()];
        Iterator it = arrayList.iterator();
        l.e("iterator(...)", it);
        while (it.hasNext()) {
            Object next = it.next();
            l.e("next(...)", next);
            j jVar3 = (j) next;
            int size = list.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                if (io.ktor.util.RangesKt.contains(jVar3, list.get(i7))) {
                    jVarArr[i7] = jVar3;
                    break;
                }
                i7++;
            }
        }
        return m.g0(jVarArr);
    }

    public static final RangesSpecifier parseRangesSpecifier(String str) {
        O3.l lVar;
        ContentRange bounded;
        l.f("rangeSpec", str);
        try {
            int iE0 = AbstractC2510o.e0(str, "=", 0, false, 6);
            if (iE0 != -1) {
                String strSubstring = str.substring(0, iE0);
                l.e("substring(...)", strSubstring);
                String strSubstring2 = str.substring(iE0 + 1);
                l.e("substring(...)", strSubstring2);
                List<String> listV0 = AbstractC2510o.v0(strSubstring2, new char[]{','});
                ArrayList arrayList = new ArrayList(r.p(listV0, 10));
                for (String str2 : listV0) {
                    if (AbstractC2517v.T(str2, "-", false)) {
                        bounded = new ContentRange.Suffix(Long.parseLong(AbstractC2510o.o0(str2, "-")));
                    } else {
                        int iE02 = AbstractC2510o.e0(str2, "-", 0, false, 6);
                        if (iE02 == -1) {
                            lVar = new O3.l("", "");
                        } else {
                            String strSubstring3 = str2.substring(0, iE02);
                            l.e("substring(...)", strSubstring3);
                            String strSubstring4 = str2.substring(iE02 + 1);
                            l.e("substring(...)", strSubstring4);
                            lVar = new O3.l(strSubstring3, strSubstring4);
                        }
                        String str3 = (String) lVar.f7528k;
                        String str4 = (String) lVar.f7529l;
                        bounded = str4.length() > 0 ? new ContentRange.Bounded(Long.parseLong(str3), Long.parseLong(str4)) : new ContentRange.TailFrom(Long.parseLong(str3));
                    }
                    arrayList.add(bounded);
                }
                if (!arrayList.isEmpty() && strSubstring.length() != 0) {
                    RangesSpecifier rangesSpecifier = new RangesSpecifier(strSubstring, arrayList);
                    if (RangesSpecifier.isValid$default(rangesSpecifier, null, 1, null)) {
                        return rangesSpecifier;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static final List<j> toLongRanges(List<? extends ContentRange> list, long j7) {
        j jVar;
        j jVar2;
        j jVar3;
        l.f("<this>", list);
        ArrayList arrayList = new ArrayList(r.p(list, 10));
        for (ContentRange contentRange : list) {
            if (contentRange instanceof ContentRange.Bounded) {
                ContentRange.Bounded bounded = (ContentRange.Bounded) contentRange;
                long from = bounded.getFrom();
                long to = bounded.getTo();
                long j8 = j7 - 1;
                if (to > j8) {
                    to = j8;
                }
                jVar3 = new j(from, to);
            } else if (contentRange instanceof ContentRange.TailFrom) {
                long from2 = ((ContentRange.TailFrom) contentRange).getFrom();
                if (j7 <= Long.MIN_VALUE) {
                    jVar2 = j.f12687n;
                    jVar3 = jVar2;
                } else {
                    jVar = new j(from2, j7 - 1);
                    jVar3 = jVar;
                }
            } else {
                if (!(contentRange instanceof ContentRange.Suffix)) {
                    throw new D6.r();
                }
                long lastCount = j7 - ((ContentRange.Suffix) contentRange).getLastCount();
                if (lastCount < 0) {
                    lastCount = 0;
                }
                if (j7 <= Long.MIN_VALUE) {
                    jVar2 = j.f12687n;
                    jVar3 = jVar2;
                } else {
                    jVar = new j(lastCount, j7 - 1);
                    jVar3 = jVar;
                }
            }
            arrayList.add(jVar3);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((j) next).isEmpty()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
