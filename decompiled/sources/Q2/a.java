package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m.C1484e;

/* loaded from: classes.dex */
public abstract class a {
    public final C1484e a;

    /* renamed from: b, reason: collision with root package name */
    public final C1484e f7944b;

    /* renamed from: c, reason: collision with root package name */
    public final C1484e f7945c;

    public a(C1484e c1484e, C1484e c1484e2, C1484e c1484e3) {
        this.a = c1484e;
        this.f7944b = c1484e2;
        this.f7945c = c1484e3;
    }

    public abstract b a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C1484e c1484e = this.f7945c;
        Class cls2 = (Class) c1484e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1484e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        C1484e c1484e = this.a;
        Method method = (Method) c1484e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        c1484e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C1484e c1484e = this.f7944b;
        Method method = (Method) c1484e.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, a.class);
        c1484e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i7);

    public final int f(int i7, int i8) {
        return !e(i8) ? i7 : ((b) this).f7947e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i7) {
        if (!e(i7)) {
            return parcelable;
        }
        return ((b) this).f7947e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String string = ((b) this).f7947e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (c) c(string).invoke(null, a());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    public abstract void i(int i7);

    public final void j(int i7, int i8) {
        i(i8);
        ((b) this).f7947e.writeInt(i7);
    }

    public final void k(Parcelable parcelable, int i7) {
        i(i7);
        ((b) this).f7947e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (cVar == null) {
            ((b) this).f7947e.writeString(null);
            return;
        }
        try {
            ((b) this).f7947e.writeString(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                int i7 = bVarA.f7951i;
                if (i7 >= 0) {
                    int i8 = bVarA.f7946d.get(i7);
                    Parcel parcel = bVarA.f7947e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(iDataPosition - i8);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
            } catch (InvocationTargetException e10) {
                if (!(e10.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
                }
                throw ((RuntimeException) e10.getCause());
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }
}
