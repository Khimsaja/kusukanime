package U1;

import B1.C0023j;
import B1.C0024k;
import B1.G;
import android.opengl.GLES20;
import android.util.Log;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f9145i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f9146j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f9147k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public G f9148b;

    /* renamed from: c, reason: collision with root package name */
    public C0023j f9149c;

    /* renamed from: d, reason: collision with root package name */
    public int f9150d;

    /* renamed from: e, reason: collision with root package name */
    public int f9151e;

    /* renamed from: f, reason: collision with root package name */
    public int f9152f;

    /* renamed from: g, reason: collision with root package name */
    public int f9153g;

    /* renamed from: h, reason: collision with root package name */
    public int f9154h;

    public static boolean b(f fVar) {
        G[] gArr = fVar.a.a;
        if (gArr.length == 1 && gArr[0].f293b == 0) {
            G[] gArr2 = fVar.f9142b.a;
            if (gArr2.length == 1 && gArr2[0].f293b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            C0023j c0023j = new C0023j("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f9149c = c0023j;
            this.f9150d = GLES20.glGetUniformLocation(c0023j.f336k, "uMvpMatrix");
            this.f9151e = GLES20.glGetUniformLocation(this.f9149c.f336k, "uTexMatrix");
            this.f9152f = this.f9149c.e("aPosition");
            this.f9153g = this.f9149c.e("aTexCoords");
            this.f9154h = GLES20.glGetUniformLocation(this.f9149c.f336k, "uTexture");
        } catch (C0024k e7) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e7);
        }
    }
}
