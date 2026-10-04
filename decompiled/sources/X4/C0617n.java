package X4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617n {
    public final AbstractC0615l a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9903b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0618o f9904c;

    /* renamed from: d, reason: collision with root package name */
    public final C0616m f9905d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f9906e;

    public C0617n(AbstractC0615l abstractC0615l, Object obj, AbstractC0618o abstractC0618o, C0616m c0616m, Class cls) {
        if (abstractC0615l == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c0616m.f9901l == Q.f9860p && abstractC0618o == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = abstractC0615l;
        this.f9903b = obj;
        this.f9904c = abstractC0618o;
        this.f9905d = c0616m;
        if (!InterfaceC0619p.class.isAssignableFrom(cls)) {
            this.f9906e = null;
            return;
        }
        try {
            this.f9906e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e7) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 52);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"valueOf\".");
            throw new RuntimeException(sb.toString(), e7);
        }
    }

    public final Object a(Object obj) {
        if (this.f9905d.f9901l.f9863k != S.ENUM) {
            return obj;
        }
        try {
            return this.f9906e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.f9905d.f9901l.f9863k == S.ENUM ? Integer.valueOf(((InterfaceC0619p) obj).a()) : obj;
    }
}
