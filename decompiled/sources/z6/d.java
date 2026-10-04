package z6;

import A.e;
import B6.f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public abstract class d {
    public static volatile int a;

    /* renamed from: b, reason: collision with root package name */
    public static final B6.c f19063b = new B6.c(1);

    /* renamed from: c, reason: collision with root package name */
    public static final B6.c f19064c = new B6.c(0);

    /* renamed from: d, reason: collision with root package name */
    public static volatile B6.c f19065d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f19066e;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            property.equalsIgnoreCase("true");
        }
        f19066e = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        B6.c cVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i7 = B6.d.a;
                if (AbstractC1755i.b(2) >= AbstractC1755i.b(B6.d.f551b)) {
                    B6.d.b().println("SLF4J(I): " + str);
                }
                cVar = (B6.c) classLoader.loadClass(property).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassCastException e7) {
                B6.d.a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e7);
            } catch (ClassNotFoundException e8) {
                e = e8;
                B6.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e9) {
                e = e9;
                B6.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e10) {
                e = e10;
                B6.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e11) {
                e = e11;
                B6.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e12) {
                e = e12;
                B6.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (cVar != null) {
            arrayList.add(cVar);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(B6.c.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: z6.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(B6.c.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((B6.c) it.next());
            } catch (ServiceConfigurationError e13) {
                String str2 = "A service provider failed to instantiate:\n" + e13.getMessage();
                B6.d.b().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    public static b b(String str) {
        B6.c cVar;
        a aVar;
        if (a == 0) {
            synchronized (d.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        c();
                    }
                } finally {
                }
            }
        }
        int i7 = a;
        if (i7 == 1) {
            cVar = f19063b;
        } else {
            if (i7 == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i7 == 3) {
                cVar = f19065d;
            } else {
                if (i7 != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                cVar = f19064c;
            }
        }
        switch (cVar.a) {
            case 0:
                aVar = (e) cVar.f550b;
                break;
            default:
                aVar = (f) cVar.f550b;
                break;
        }
        return aVar.c(str);
    }

    public static final void c() {
        try {
            ArrayList arrayListA = a();
            g(arrayListA);
            if (arrayListA.isEmpty()) {
                a = 4;
                B6.d.c("No SLF4J providers were found.");
                B6.d.c("Defaulting to no-operation (NOP) logger implementation");
                B6.d.c("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e7) {
                    B6.d.a("Error getting resources from path", e7);
                }
                f(linkedHashSet);
            } else {
                f19065d = (B6.c) arrayListA.get(0);
                f19065d.getClass();
                f19065d.getClass();
                a = 3;
                e(arrayListA);
            }
            d();
            if (a == 3) {
                try {
                    switch (f19065d.a) {
                        case 0:
                            boolean z7 = false;
                            for (String str : f19066e) {
                                if ("2.0.99".startsWith(str)) {
                                    z7 = true;
                                }
                            }
                            if (z7) {
                                return;
                            }
                            B6.d.c("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f19066e).toString());
                            B6.d.c("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    B6.d.a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e8) {
            a = 2;
            B6.d.a("Failed to instantiate SLF4J LoggerFactory", e8);
            throw new IllegalStateException("Unexpected initialization failure", e8);
        }
    }

    public static void d() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        B6.c cVar = f19063b;
        synchronized (cVar) {
            try {
                ((f) cVar.f550b).f559k = true;
                f fVar = (f) cVar.f550b;
                fVar.getClass();
                Iterator it = new ArrayList(fVar.f560l.values()).iterator();
                while (it.hasNext()) {
                    B6.e eVar = (B6.e) it.next();
                    eVar.f553l = b(eVar.f552k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((f) f19063b.f550b).f561m;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i7 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A6.c cVar2 = (A6.c) it2.next();
                if (cVar2 != null) {
                    B6.e eVar2 = cVar2.f260b;
                    String str = eVar2.f552k;
                    if (eVar2.f553l == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(eVar2.f553l instanceof B6.b)) {
                        if (!eVar2.m()) {
                            B6.d.c(str);
                        } else if (eVar2.g(cVar2.a) && eVar2.m()) {
                            try {
                                eVar2.f555n.invoke(eVar2.f553l, cVar2);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i8 = i7 + 1;
                if (i7 == 0) {
                    if (cVar2.f260b.m()) {
                        B6.d.c("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        B6.d.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        B6.d.c("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(cVar2.f260b.f553l instanceof B6.b)) {
                        B6.d.c("The following set of substitute loggers may have been accessed");
                        B6.d.c("during the initialization phase. Logging calls during this");
                        B6.d.c("phase were not honored. However, subsequent logging calls to these");
                        B6.d.c("loggers will work as normally expected.");
                        B6.d.c("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i7 = i8;
            }
            arrayList.clear();
        }
        f fVar2 = (f) f19063b.f550b;
        fVar2.f560l.clear();
        fVar2.f561m.clear();
    }

    public static void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i7 = B6.d.a;
            if (AbstractC1755i.b(2) >= AbstractC1755i.b(B6.d.f551b)) {
                B6.d.b().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((B6.c) arrayList.get(0)).getClass().getName() + "]";
        int i8 = B6.d.a;
        if (AbstractC1755i.b(1) >= AbstractC1755i.b(B6.d.f551b)) {
            B6.d.b().println("SLF4J(D): " + str2);
        }
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        B6.d.c("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            B6.d.c("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        B6.d.c("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            B6.d.c("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                B6.d.c("Found provider [" + ((B6.c) it.next()) + "]");
            }
            B6.d.c("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
