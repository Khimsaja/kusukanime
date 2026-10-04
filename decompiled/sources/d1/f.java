package d1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c1.C0748b;
import c1.C0749c;
import g1.i;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: n, reason: collision with root package name */
    public final Class f11213n;

    /* renamed from: o, reason: collision with root package name */
    public final Constructor f11214o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f11215p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f11216q;

    /* renamed from: r, reason: collision with root package name */
    public final Method f11217r;

    /* renamed from: s, reason: collision with root package name */
    public final Method f11218s;

    /* renamed from: t, reason: collision with root package name */
    public final Method f11219t;

    public f() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodZ;
        Method method2;
        Method method3;
        Method methodA0;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodZ = Z(cls);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodA0 = a0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            cls = null;
            method = null;
            constructor = null;
            methodZ = null;
            method2 = null;
            method3 = null;
            methodA0 = null;
        }
        this.f11213n = cls;
        this.f11214o = constructor;
        this.f11215p = methodZ;
        this.f11216q = method2;
        this.f11217r = method3;
        this.f11218s = method;
        this.f11219t = methodA0;
    }

    public static Method Z(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void U(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f11218s.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean V(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f11215p.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface W(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f11213n, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f11219t.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean X(Object obj) {
        try {
            return ((Boolean) this.f11217r.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object Y() {
        try {
            return this.f11214o.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method a0(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // d1.d, l4.AbstractC1420H
    public final Typeface s(Context context, C0748b c0748b, Resources resources) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f11215p;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.s(context, c0748b, resources);
        }
        Object objY = Y();
        if (objY != null) {
            C0749c[] c0749cArr = c0748b.a;
            int length = c0749cArr.length;
            int i7 = 0;
            while (i7 < length) {
                C0749c c0749c = c0749cArr[i7];
                String str = c0749c.a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0749c.f11139d);
                Context context2 = context;
                if (!V(context2, objY, str, c0749c.f11140e, c0749c.f11137b, c0749c.f11138c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    U(objY);
                    return null;
                }
                i7++;
                context = context2;
            }
            if (X(objY)) {
                return W(objY);
            }
        }
        return null;
    }

    @Override // d1.d, l4.AbstractC1420H
    public final Typeface t(Context context, i[] iVarArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceW;
        boolean zBooleanValue;
        if (iVarArr.length >= 1) {
            Method method = this.f11215p;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (i iVar : iVarArr) {
                    if (iVar.f11689e == 0) {
                        Uri uri = iVar.a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, n6.d.R(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objY = Y();
                if (objY != null) {
                    int length = iVarArr.length;
                    int i7 = 0;
                    boolean z7 = false;
                    while (i7 < length) {
                        i iVar2 = iVarArr[i7];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f11216q.invoke(objY, byteBuffer, Integer.valueOf(iVar2.f11686b), null, Integer.valueOf(iVar2.f11687c), Integer.valueOf(iVar2.f11688d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                U(objY);
                                return null;
                            }
                            z7 = true;
                        }
                        i7++;
                        z7 = z7;
                    }
                    if (!z7) {
                        U(objY);
                        return null;
                    }
                    if (X(objY) && (typefaceW = W(objY)) != null) {
                        return Typeface.create(typefaceW, 0);
                    }
                }
            } else {
                i iVarA = A(iVarArr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVarA.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVarA.f11687c).setItalic(iVarA.f11688d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // l4.AbstractC1420H
    public final Typeface w(Context context, Resources resources, int i7, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f11215p;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.w(context, resources, i7, str);
        }
        Object objY = Y();
        if (objY != null) {
            if (!V(context, objY, str, 0, -1, -1, null)) {
                U(objY);
                return null;
            }
            if (X(objY)) {
                return W(objY);
            }
        }
        return null;
    }
}
