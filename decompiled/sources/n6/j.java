package n6;

import P3.r;
import f6.EnumC0888B;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: c, reason: collision with root package name */
    public final Method f13444c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f13445d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f13446e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f13447f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f13448g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f13444c = method;
        this.f13445d = method2;
        this.f13446e = method3;
        this.f13447f = cls;
        this.f13448g = cls2;
    }

    @Override // n6.o
    public final void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f13446e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        }
    }

    @Override // n6.o
    public final void d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f("protocols", list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC0888B) obj) != EnumC0888B.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0888B) it.next()).f11470k);
        }
        try {
            this.f13444c.invoke(null, sSLSocket, Proxy.newProxyInstance(o.class.getClassLoader(), new Class[]{this.f13447f, this.f13448g}, new i(arrayList2)));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        }
    }

    @Override // n6.o
    public final String f(SSLSocket sSLSocket) throws IllegalArgumentException {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f13445d.invoke(null, sSLSocket));
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider", invocationHandler);
            i iVar = (i) invocationHandler;
            boolean z7 = iVar.f13442b;
            if (!z7 && iVar.f13443c == null) {
                o.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z7) {
                return null;
            }
            return iVar.f13443c;
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        }
    }
}
