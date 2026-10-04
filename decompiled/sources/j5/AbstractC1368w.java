package j5;

import u4.M;

/* renamed from: j5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1368w {
    public final T4.g a;

    /* renamed from: b, reason: collision with root package name */
    public final T4.i f12478b;

    /* renamed from: c, reason: collision with root package name */
    public final M f12479c;

    public AbstractC1368w(T4.g gVar, T4.i iVar, M m7) {
        this.a = gVar;
        this.f12478b = iVar;
        this.f12479c = m7;
    }

    public abstract W4.c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
