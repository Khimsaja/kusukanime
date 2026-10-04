package B1;

import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0703b;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: B1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0015b {
    public static ExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f313b = new Object();

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f313b) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void d() throws C0024k {
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z7) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z7 = true;
        }
        if (z7) {
            throw new C0024k(sb.toString());
        }
    }

    public static void e(String str, boolean z7) throws C0024k {
        if (!z7) {
            throw new C0024k(str);
        }
    }

    public static void f(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void g(String str, boolean z7) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void h(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void j(String str, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static FloatBuffer k(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void l(String str, String str2) {
        synchronized (f313b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void m(String str, String str2) {
        synchronized (f313b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void n(String str, String str2, Throwable th) {
        synchronized (f313b) {
            Log.e(str, a(str2, th));
        }
    }

    public static synchronized Executor o() {
        try {
            if (a == null) {
                int i7 = K.a;
                a = Executors.newSingleThreadExecutor(new I("ExoPlayer:BackgroundExecutor", 0));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static String p(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    public static void q(String str, String str2) {
        synchronized (f313b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void t(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static void u(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(AbstractC0703b.g(i7, "csd-"), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }

    public static void v(String str, String str2) {
        synchronized (f313b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void w(String str, String str2, Throwable th) {
        synchronized (f313b) {
            Log.w(str, a(str2, th));
        }
    }
}
