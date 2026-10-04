package P0;

import B2.l;
import C2.C0034g;
import H0.I;
import H0.r;
import H0.w;
import I0.m;
import O.R0;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: k, reason: collision with root package name */
    public final String f7692k;

    /* renamed from: l, reason: collision with root package name */
    public final I f7693l;

    /* renamed from: m, reason: collision with root package name */
    public final List f7694m;

    /* renamed from: n, reason: collision with root package name */
    public final List f7695n;

    /* renamed from: o, reason: collision with root package name */
    public final M0.i f7696o;

    /* renamed from: p, reason: collision with root package name */
    public final T0.b f7697p;

    /* renamed from: q, reason: collision with root package name */
    public final e f7698q;

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f7699r;

    /* renamed from: s, reason: collision with root package name */
    public final m f7700s;

    /* renamed from: t, reason: collision with root package name */
    public l f7701t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f7702u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7703v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x055c  */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v0, types: [P0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [H0.B] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r41, H0.I r42, java.util.List r43, java.util.List r44, M0.i r45, T0.b r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.c.<init>(java.lang.String, H0.I, java.util.List, java.util.List, M0.i, T0.b):void");
    }

    @Override // H0.r
    public final float a() {
        m mVar = this.f7700s;
        if (!Float.isNaN(mVar.f3903e)) {
            return mVar.f3903e;
        }
        TextPaint textPaint = mVar.f3900b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = mVar.a;
        lineInstance.setText(new I0.j(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new B2.e(4));
        int i7 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new O3.l(Integer.valueOf(i7), Integer.valueOf(next)));
            } else {
                O3.l lVar = (O3.l) priorityQueue.peek();
                if (lVar != null && ((Number) lVar.f7529l).intValue() - ((Number) lVar.f7528k).intValue() < next - i7) {
                    priorityQueue.poll();
                    priorityQueue.add(new O3.l(Integer.valueOf(i7), Integer.valueOf(next)));
                }
            }
            i7 = next;
        }
        Iterator it = priorityQueue.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            O3.l lVar2 = (O3.l) it.next();
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) lVar2.f7528k).intValue(), ((Number) lVar2.f7529l).intValue(), textPaint));
        }
        mVar.f3903e = fMax;
        return fMax;
    }

    @Override // H0.r
    public final boolean b() {
        l lVar = this.f7701t;
        if (lVar != null ? lVar.H() : false) {
            return true;
        }
        if (!this.f7702u) {
            w wVar = this.f7693l.f3095c;
            C0034g c0034g = i.a;
            C0034g c0034g2 = i.a;
            R0 r0L = (R0) c0034g2.f741l;
            if (r0L == null) {
                if (p1.g.c()) {
                    r0L = c0034g2.l();
                    c0034g2.f741l = r0L;
                } else {
                    r0L = j.a;
                }
            }
            if (((Boolean) r0L.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // H0.r
    public final float c() {
        return this.f7700s.b();
    }
}
