/*
 * This file is part of UltimateCore, licensed under the MIT License (MIT).
 *
 * Copyright (c) Bammerbom
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package bammerbom.ultimatecore.bukkit.configuration;

/**
 * Exception thrown when attempting to load an invalid {@link Configuration}
 */
@SuppressWarnings("serial")
class InvalidConfigurationException extends Exception {

    /**
     * Creates a new instance of InvalidConfigurationException without a message or cause.
     */
    public InvalidConfigurationException() {
    }

    /**
     * Constructs an instance of InvalidConfigurationException with the specified message.
     *
     * @param msg The details of the exception.
     */
    public InvalidConfigurationException(String msg) {
        super(msg);
    }

    /**
     * Constructs an instance of InvalidConfigurationException with the specified cause.
     *
     * @param cause The cause of the exception.
     */
    public InvalidConfigurationException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs an instance of InvalidConfigurationException with the specified message and
     * cause.
     *
     * @param cause The cause of the exception.
     * @param msg   The details of the exception.
     */
    public InvalidConfigurationException(String msg, Throwable cause) {
        super(msg, cause);
    }
}