package o6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import n6.o;
import z5.C2496a;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f13822f = new e();
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f13823b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f13824c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f13825d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f13826e;

    public f(Class cls) throws NoSuchMethodException, SecurityException {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.l.e("sslSocketClass.getDeclar…:class.javaPrimitiveType)", declaredMethod);
        this.f13823b = declaredMethod;
        this.f13824c = cls.getMethod("setHostname", String.class);
        this.f13825d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f13826e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // o6.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // o6.m
    public final String b(SSLSocket sSLSocket) {
        if (!this.a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f13825d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, C2496a.f19036b);
            }
            return null;
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if ((cause instanceof NullPointerException) && kotlin.jvm.internal.l.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e8);
        }
    }

    @Override // o6.m
    public final boolean c() {
        boolean z7 = n6.c.f13429e;
        return n6.c.f13429e;
    }

    @Override // o6.m
    public final void d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f("protocols", list);
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.f13823b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f13824c.invoke(sSLSocket, str);
                }
                Method method = this.f13826e;
                o oVar = o.a;
                method.invoke(sSLSocket, R1.i.n(list));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }
    }
}
