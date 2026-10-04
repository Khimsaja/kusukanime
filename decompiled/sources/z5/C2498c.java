package z5;

import java.util.Iterator;

/* renamed from: z5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2498c implements y5.h {
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19044b;

    /* renamed from: c, reason: collision with root package name */
    public final e4.n f19045c;

    public C2498c(CharSequence charSequence, int i7, e4.n nVar) {
        kotlin.jvm.internal.l.f("input", charSequence);
        this.a = charSequence;
        this.f19044b = i7;
        this.f19045c = nVar;
    }

    @Override // y5.h
    public final Iterator iterator() {
        return new C2497b(this);
    }
}
