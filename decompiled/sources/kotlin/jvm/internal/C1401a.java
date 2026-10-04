package kotlin.jvm.internal;

import java.io.Serializable;
import l4.InterfaceC1427f;

/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1401a implements h, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C1401a(Class cls, String str) {
        this(0, 0, cls, AbstractC1403c.NO_RECEIVER, "<init>", str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1401a)) {
            return false;
        }
        C1401a c1401a = (C1401a) obj;
        return this.isTopLevel == c1401a.isTopLevel && this.arity == c1401a.arity && this.flags == c1401a.flags && l.a(this.receiver, c1401a.receiver) && l.a(this.owner, c1401a.owner) && this.name.equals(c1401a.name) && this.signature.equals(c1401a.signature);
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public InterfaceC1427f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? y.a.c(cls) : y.a.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((A6.b.b(this.signature, A6.b.b(this.name, (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return y.a.i(this);
    }

    public C1401a(int i7, int i8, Class cls, Object obj, String str, String str2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = false;
        this.arity = i7;
        this.flags = i8 >> 1;
    }
}
