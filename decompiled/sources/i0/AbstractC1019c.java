package i0;

import b1.AbstractC0703b;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1019c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11866b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11867c;

    public AbstractC1019c(String str, long j7, int i7) {
        this.a = str;
        this.f11866b = j7;
        this.f11867c = i7;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i7 < -1 || i7 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i7);

    public abstract float b(int i7);

    public boolean c() {
        return false;
    }

    public abstract long d(float f5, float f7, float f8);

    public abstract float e(float f5, float f7, float f8);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1019c abstractC1019c = (AbstractC1019c) obj;
        if (this.f11867c == abstractC1019c.f11867c && kotlin.jvm.internal.l.a(this.a, abstractC1019c.a)) {
            return AbstractC1018b.a(this.f11866b, abstractC1019c.f11866b);
        }
        return false;
    }

    public abstract long f(float f5, float f7, float f8, float f9, AbstractC1019c abstractC1019c);

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i7 = AbstractC1018b.f11865e;
        return AbstractC0703b.c(iHashCode, 31, this.f11866b) + this.f11867c;
    }

    public final String toString() {
        return this.a + " (id=" + this.f11867c + ", model=" + ((Object) AbstractC1018b.b(this.f11866b)) + ')';
    }
}
