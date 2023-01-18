package org.lwjglx.opengl;

public class EXTSecondaryColor {
    public static final int GL_COLOR_SUM_EXT = 33880;
    public static final int GL_CURRENT_SECONDARY_COLOR_EXT = 33881;
    public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 33886;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 33885;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE_EXT = 33882;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 33884;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE_EXT = 33883;

    public static void glSecondaryColor3bEXT(byte red, byte green, byte blue) {
        org.lwjgl.opengl.EXTSecondaryColor.glSecondaryColor3bEXT(red, green, blue);
    }

    public static void glSecondaryColor3dEXT(double red, double green, double blue) {
        org.lwjgl.opengl.EXTSecondaryColor.glSecondaryColor3dEXT(red, green, blue);
    }

    public static void glSecondaryColor3fEXT(float red, float green, float blue) {
        org.lwjgl.opengl.EXTSecondaryColor.glSecondaryColor3fEXT(red, green, blue);
    }

    public static void glSecondaryColor3ubEXT(byte red, byte green, byte blue) {
        org.lwjgl.opengl.EXTSecondaryColor.glSecondaryColor3ubEXT(red, green, blue);
    }

    public static void glSecondaryColorPointerEXT(int size, int type, int stride, long pPointer_buffer_offset) {
        org.lwjgl.opengl.EXTSecondaryColor.glSecondaryColorPointerEXT(size, type, stride, pPointer_buffer_offset);
    }

    public static void glSecondaryColorPointerEXT(int size, int stride, java.nio.DoubleBuffer pPointer) {

        org.lwjgl.opengl.EXTSecondaryColor.glSecondaryColorPointerEXT(
                size,
                org.lwjgl.opengl.GL11.GL_DOUBLE,
                stride,
                me.eigenraven.lwjgl3ify.BufferCasts.toByteBuffer(pPointer));
    }

    public static void glSecondaryColorPointerEXT(int size, int stride, java.nio.FloatBuffer pPointer) {

        org.lwjgl.opengl.EXTSecondaryColor.glSecondaryColorPointerEXT(
                size, org.lwjgl.opengl.GL11.GL_FLOAT, stride, pPointer);
    }

    public static void glSecondaryColorPointerEXT(
            int size, boolean unsigned, int stride, java.nio.ByteBuffer pPointer) {

        org.lwjgl.opengl.EXTSecondaryColor.glSecondaryColorPointerEXT(
                size,
                (unsigned ? org.lwjgl.opengl.GL11.GL_UNSIGNED_BYTE : org.lwjgl.opengl.GL11.GL_BYTE),
                stride,
                org.lwjglx.MemoryUtil.getAddress(pPointer));
    }
}
