package d1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import g1.i;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import l4.AbstractC1420H;
import m.C1477G;

/* loaded from: classes.dex */
public final class e extends AbstractC1420H {

    /* renamed from: i, reason: collision with root package name */
    public static final Class f11209i;

    /* renamed from: j, reason: collision with root package name */
    public static final Constructor f11210j;

    /* renamed from: k, reason: collision with root package name */
    public static final Method f11211k;

    /* renamed from: l, reason: collision with root package name */
    public static final Method f11212l;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f11210j = constructor;
        f11209i = cls;
        f11211k = method;
        f11212l = method2;
    }

    public static boolean S(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z7) {
        try {
            return ((Boolean) f11211k.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface T(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f11209i, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f11212l.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068 A[SYNTHETIC] */
    @Override // l4.AbstractC1420H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface s(android.content.Context r17, c1.C0748b r18, android.content.res.Resources r19) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r16 = this;
            r1 = 0
            r0 = 0
            java.lang.reflect.Constructor r2 = d1.e.f11210j     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            goto L68
        Lf:
            r3 = r18
            c1.c[] r3 = r3.a
            int r4 = r3.length
            r5 = r0
        L15:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f11141f
            java.io.File r7 = n6.d.H(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L59
        L25:
            r8 = r19
            boolean r0 = n6.d.w(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            goto L68
        L5c:
            int r7 = r6.f11137b
            boolean r9 = r6.f11138c
            int r6 = r6.f11140e
            boolean r0 = S(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
        L68:
            return r1
        L69:
            int r5 = r5 + 1
            goto L15
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = T(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e.s(android.content.Context, c1.b, android.content.res.Resources):android.graphics.Typeface");
    }

    @Override // l4.AbstractC1420H
    public final Typeface t(Context context, i[] iVarArr) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f11210j.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C1477G c1477g = new C1477G(0);
            int length = iVarArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    Typeface typefaceT = T(objNewInstance);
                    if (typefaceT != null) {
                        return Typeface.create(typefaceT, 0);
                    }
                } else {
                    i iVar = iVarArr[i7];
                    Uri uri = iVar.a;
                    ByteBuffer byteBufferR = (ByteBuffer) c1477g.get(uri);
                    if (byteBufferR == null) {
                        byteBufferR = n6.d.R(context, uri);
                        c1477g.put(uri, byteBufferR);
                    }
                    if (byteBufferR == null) {
                        break;
                    }
                    if (!S(objNewInstance, byteBufferR, iVar.f11686b, iVar.f11687c, iVar.f11688d)) {
                        break;
                    }
                    i7++;
                }
            }
        }
        return null;
    }
}
