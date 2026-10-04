package d1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import c1.C0748b;
import c1.C0749c;
import g1.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public class d extends AbstractC1420H {

    /* renamed from: i, reason: collision with root package name */
    public static Class f11204i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Constructor f11205j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f11206k = null;

    /* renamed from: l, reason: collision with root package name */
    public static Method f11207l = null;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f11208m = false;

    public static boolean S(String str, boolean z7, int i7, Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        T();
        try {
            return ((Boolean) f11206k.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void T() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f11208m) {
            return;
        }
        f11208m = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f11205j = constructor;
        f11204i = cls;
        f11206k = method2;
        f11207l = method;
    }

    @Override // l4.AbstractC1420H
    public Typeface s(Context context, C0748b c0748b, Resources resources) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        T();
        try {
            Object objNewInstance = f11205j.newInstance(new Object[0]);
            for (C0749c c0749c : c0748b.a) {
                File fileH = n6.d.H(context);
                if (fileH == null) {
                    return null;
                }
                try {
                    if (!n6.d.w(fileH, resources, c0749c.f11141f)) {
                        return null;
                    }
                    if (!S(fileH.getPath(), c0749c.f11138c, c0749c.f11137b, objNewInstance)) {
                        return null;
                    }
                    fileH.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileH.delete();
                }
            }
            T();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f11204i, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f11207l.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // l4.AbstractC1420H
    public Typeface t(Context context, i[] iVarArr) throws IOException {
        String str;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(A(iVarArr).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceV = v(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceV;
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
        return null;
    }
}
